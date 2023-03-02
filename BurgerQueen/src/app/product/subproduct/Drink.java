package app.product.subproduct;

import app.product.Product;

public class Drink extends Product {     //Drink class that inherits from the Product class
    private boolean hasStraw;        // instance variable of Drink class

    public Drink(int id, String name, int price, int kcal, boolean hasStew) {   // default constructor of Drink class
        super(id, name, price, kcal);   // call the parent class constructor
        this.hasStraw = hasStew;         // field of Drink class
    }

    public boolean HasStew() {      //getter of hasStraw
        return hasStraw;
    }

    public void setHasStraw(boolean hasStraw) { //setter of hasStraw
        this.hasStraw = hasStraw;
    }
}
