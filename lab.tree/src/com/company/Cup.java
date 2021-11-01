package com.company;

public class Cup extends Dish {

    @Override
    void for_tea() {
        System.out.println("Cup - suitable for tea");
    }

    @Override
    void for_coffee() {
        System.out.println("Cup - suitable for coffee");
    }
}
