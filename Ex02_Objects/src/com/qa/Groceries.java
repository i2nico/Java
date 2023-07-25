package com.qa;

import java.util.Arrays;

public class Groceries {
    private String items[];

    public Groceries(String[] items) {
        this.items = items;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Groceries{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
