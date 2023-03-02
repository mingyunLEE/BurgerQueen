package app;

public class Product {      //Product class
    private int id;         // instance variable of Product
    private String name;    // instance variable of Product
    private int price;      // instance variable of Product
    private int kcal;       // instance variable of Product

    public Product(int id, String name, int price, int kcal) {  //default constructor of Product class
        this.id = id;                                           //this id = filld variable of Product class
        this.name = name;                                       //this name is field variable of Product class
        this.price = price;                                     //this price is field variable of Product class
        this.kcal = kcal;                                       //this kcal is field variable of Product class
    }

    public int getId() {        // Getter of id variable
        return id;
    }

    public String getName() {       // Getter of name variable
        return name;
    }

    public int getPrice() {     // Getter of price variable
        return price;
    }

    public int getKcal() {      // Getter of kcal variable
        return kcal;
    }
}
