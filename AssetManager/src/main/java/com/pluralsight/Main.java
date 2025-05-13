package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();


        assets.add(new House("Home", "06-08-2016", 750000, "724 Bacon View Drive", 1, 4500, 9000));
        assets.add(new House("Lake House", "01-09-2020", 1380000, "187 Treasure Lake Drive", 2, 3500, 11000));

        assets.add(new Vehicle("First car","07-23-2019", 2000, "Dodge Dakota", 2001, 120000));
        assets.add(new Vehicle("Current car", "06-21-2024", 14000, "Hyundia SE", 2017, 31000));
    }
}
