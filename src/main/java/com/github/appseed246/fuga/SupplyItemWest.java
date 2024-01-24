package com.github.appseed246.fuga;

import com.github.appseed246.hoge.ItemWest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public enum SupplyItemWest implements SupplyItem<ItemWest> {
    SUPPLY_ITEM_WEST1("提供アイテム1", "SP01E", ItemWest.ITEM1),
    SUPPLY_ITEM_WEST2("提供アイテム2", "SP02E", ItemWest.ITEM2);


    private final String label;

    @Getter
    private final String value;

    @Getter
    private final ItemWest item;

    public static Optional<SupplyItemWest> fromItem(ItemWest item) {
        return SupplyItem.fromItem(item, SupplyItemWest.class);
    }
}