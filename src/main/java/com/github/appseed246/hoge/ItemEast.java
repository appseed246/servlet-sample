package com.github.appseed246.hoge;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ItemEast implements Item {
    ITEM1("Eアイテム1", "E01"),
    ITEM2("Eアイテム2", "E02"),
    ITEM3("Eアイテム3", "E03");

    private final String label;

    @Getter
    private final String value;
}