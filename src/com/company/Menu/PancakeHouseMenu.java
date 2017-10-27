package com.company.Menu;


import com.company.Iterators.Iterator;
import com.company.Iterators.PancakeHouseMenuIterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;
    private String name;

    public PancakeHouseMenu(String name) {
        this.name = name;
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                false,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    @Override
    public String getName() {
        return name;
    }

    public String toString() {
        return "Objectville Pancake House Menu";
    }

    // other menu methods here
}