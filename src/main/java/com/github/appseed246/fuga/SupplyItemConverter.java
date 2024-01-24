package com.github.appseed246.fuga;

import com.github.appseed246.hoge.ItemEast;
import com.github.appseed246.hoge.ItemWest;

import java.util.Optional;

public class SupplyItemConverter {
    public static Optional<SupplyItem<?>> fromItem(ItemEast item) {
        return SupplyItem.fromItem(item, SupplyItemEast.class);
    }

    public static Optional<SupplyItem<?>> fromItem(ItemWest item) {
        return SupplyItem.fromItem(item, SupplyItemWest.class);
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

        Optional<SupplyItem<?>> s3 = SupplyItemConverter.fromItem(ItemWest.ITEM1);
        //Optional<SupplyItem<Item>> s3 = SupplyItemConverter.fromItem(ItemEast.ITEM1)
        s3.ifPresentOrElse(
                (s) -> {
                    System.out.println(s.getValue());
                },
                () -> {
                    System.out.println("s3 not found");
                }
        );
    }
}
