package com.github.appseed246.fuga;

import com.github.appseed246.hoge.ItemEast;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SupplyItemEast implements SupplyItem<ItemEast> {
    SUPPLY_ITEM_EAST1("提供アイテム1", "SP01E", ItemEast.ITEM1),
    SUPPLY_ITEM_EAST2("提供アイテム2", "SP02E", ItemEast.ITEM2);

    private final String label;

    @Getter
    private final String value;

    @Getter
    private final ItemEast item;
}
