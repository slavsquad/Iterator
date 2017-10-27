package com.company;

import com.company.Menu.DinerMenu;
import com.company.Menu.PancakeHouseMenu;
import com.company.Waitreses.Waitress;

public class Main {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu("Pancake House Menu 27/10/17");
        DinerMenu dinerMenu = new DinerMenu("Diner Menu 27/10/17");

        Waitress waitress = new Waitress(pancakeHouseMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();

        waitress.setMenu(dinerMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
