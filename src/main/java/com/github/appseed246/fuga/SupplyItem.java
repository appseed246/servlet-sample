package com.github.appseed246.fuga;

import com.github.appseed246.hoge.Item;

import java.util.Arrays;
import java.util.Optional;

public sealed interface SupplyItem<E extends Item> permits SupplyItemEast, SupplyItemWest {
//    static <T extends SupplyItem<E>, E extends Item> Optional<T> fromItem(E item, Class<T> clazz) {
//        return Arrays.stream(clazz.getEnumConstants())
//                .filter(s -> s.getItem() == item)
//                .findAny();
//    }

    static <T extends SupplyItem<E>, E extends Item> Optional<SupplyItem<?>> fromItem(E item, Class<T> clazz) {
        return Arrays.stream(clazz.getEnumConstants())
                .filter(s -> s.getItem() == item)
                .findAny()
                .map(s -> s);
    }

    E getItem();

    String getValue();
}
