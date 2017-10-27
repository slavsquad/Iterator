package com.company.Waitreses;


import com.company.Iterators.Iterator;
import com.company.Menu.Menu;
import com.company.Menu.MenuItem;

public class Waitress {
    Menu menu;


    public Waitress(Menu menu) {
        this.menu = menu;
    }

    public void printMenu() {
        Iterator menuIterator = menu.createIterator();
        System.out.println("\n--------"+menu.getName()+"----------");
        while (menuIterator.hasNext()) {
            MenuItem menuItem = menuIterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void printVegetarianMenu() {

        Iterator menuIterator = menu.createIterator();
        System.out.println("\n--------Vegetaria "+menu.getName()+"----------");
        while (menuIterator.hasNext()) {
            MenuItem menuItem = menuIterator.next();
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName());
                System.out.print("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
    }

}