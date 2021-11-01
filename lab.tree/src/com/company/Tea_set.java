package com.company;

public class Tea_set extends Dish {
    @Override
    void for_tea() {
        System.out.println("Tea set - suitable for tea");
    }

    @Override
    void for_coffee() {
        System.out.println("Tea set - not good for coffee");
    }
}
