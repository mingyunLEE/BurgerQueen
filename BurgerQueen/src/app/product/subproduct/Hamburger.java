package app.product.subproduct;

import app.product.Product;

public class Hamburger extends Product {        // Hamburger class inherited product class
    private boolean isBurgerSet;        //instance variable of Hamburger class
    private int burgerSetPrice;         // instance variable of Hamburger class

    public Hamburger(int id, String name, int price, int kcal, boolean isBurgerSet, int burgerSetPrice) {  //default constructor of Hamburger class
        super(id, name, price, kcal);   //call the parents class constructor
        this.isBurgerSet = isBurgerSet;     // field of Hamburger class
        this.burgerSetPrice = burgerSetPrice;   // field of Hamburger class
    }

    public boolean isBurgerSet() {      //Getter of isBurgerSet
        return isBurgerSet;
    }

    public int getBurgerSetPrice() {        //Getter of isBurgerSetPrice
        return burgerSetPrice;
    }

    public void setIsBurgerSet(boolean isBurgerSet) {     //Setter of isBurgerSet
        isBurgerSet = isBurgerSet;
    }

    public void setBurgerSetPrice(int burgerSetPrice) {     //Setter of burgerSetPrice
        this.burgerSetPrice = burgerSetPrice;
    }
}

