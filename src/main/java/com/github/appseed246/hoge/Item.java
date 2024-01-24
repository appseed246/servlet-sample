package com.github.appseed246.hoge;

public sealed interface Item permits ItemEast, ItemWest {
    String getValue();
}
