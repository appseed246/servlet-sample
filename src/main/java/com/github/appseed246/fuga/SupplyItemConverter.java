package com.github.appseed246.fuga;

import com.github.appseed246.hoge.Item;
import com.github.appseed246.hoge.ItemEast;
import com.github.appseed246.hoge.ItemWest;

import java.util.Optional;

public class SupplyItemConverter {

    public static Optional<? extends SupplyItem<? extends Item>> fromItem(Item item) {
        return switch (item) {
            case ItemEast itemEast -> SupplyItemEast.fromItem(itemEast);
            case ItemWest itemWest -> SupplyItemWest.fromItem(itemWest);
        };
    }

    public static void sample() {
        var s1 = SupplyItemConverter.fromItem(ItemEast.ITEM1);
        s1.ifPresentOrElse(
                System.out::println,
                () -> {
                    System.out.println("s1 not found");
                }
        );

        var s2 = SupplyItemConverter.fromItem(ItemWest.ITEM3);
        s2.ifPresentOrElse(
                System.out::println,
                () -> {
                    System.out.println("s2 not found");
                }
        );

        Optional<? extends SupplyItem<? extends Item>> s3 = SupplyItemConverter.fromItem(ItemWest.ITEM1);
        //Optional<SupplyItem<Item>> s3 = SupplyItemConverter.fromItem(ItemEast.ITEM1)
        s3.ifPresentOrElse(
                (s) -> {
                    System.out.println(s.getValue());
                },
                () -> {
                    System.out.println("s3 not found");
                }
        );

        s3.map(s -> switch (s) {
                    case SupplyItemEast ignored -> "i1";
                    case SupplyItemWest ignored -> "i2";
                })
                .ifPresent(System.out::println);
    }
}
