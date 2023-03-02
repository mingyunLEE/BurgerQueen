package app.product.subproduct;

import app.product.Product;

public class Side extends Product { //side class that inherits from the product class
    private int ketchup;    //instance variable of Side class

    public Side(int id, String name, int price, int kcal, int ketchup) {       // default class of Side class
        super(id, name, price, kcal);       // call the upper class constructor
        this.ketchup = ketchup;     // field variable of Side class
    }

    public int getKetchup() {       // Getter of ketchup variable
        return ketchup;
    }

    public void setKetchup(int ketchup) { //Setter of ketchup variable
        this.ketchup = ketchup;
    }
}
