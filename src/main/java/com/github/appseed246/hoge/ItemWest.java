package com.github.appseed246.hoge;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ItemWest implements Item {
    ITEM1("Wアイテム1", "W01"),
    ITEM2("Wアイテム2", "W02"),

    ITEM3("Wアイテム3", "W03");

    private final String label;

    @Getter
    private final String value;
}
