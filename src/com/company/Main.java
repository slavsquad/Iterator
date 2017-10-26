package com.company;

import com.company.Menu.DinerMenu;
import com.company.Menu.PancakeHouseMenu;
import com.company.Waitreses.Waitress;

public class Main {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();

        waitress.setMenu(dinerMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
