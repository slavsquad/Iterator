package com.company.Iterators;

import com.company.Menu.MenuItem;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    int position;
    List<MenuItem> menuItems;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position>=menuItems.size()){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }
}
