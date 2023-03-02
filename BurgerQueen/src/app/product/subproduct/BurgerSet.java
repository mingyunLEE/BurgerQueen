package app.product.subproduct;

import app.Product;

public class BurgerSet extends Product {    // BurgerSet class that inherits from Product class
    private Hamburger hamburger;    //Declare a hamburger variable with the hamburger class
    private Side side;      //Declare a side variable with the Side class
    private Drink drink;    //Declare a drink variable with the drink class

    public BurgerSet(int id, String name, int price, int kcal, Hamburger hamburger) { //default constructor of BurgerSet class
        super(id, name, price, kcal);   // call the parent class constructor
        this.hamburger = hamburger; // field of BurgerSet
    }

    public Hamburger getHamburger() {   //getter of hamburger
        return hamburger;
    }

    public Side getSide() {     //getter of side
        return side;
    }

    public Drink getDrink() {       //getter of drink
        return drink;
    }
}
