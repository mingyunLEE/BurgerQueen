public class Product {
    private int id;
    private String name;
    private int price;
    private int kcal;

    public Product(int id, String name, int price, int kcal){       //Defining the default constructor for Product Class
        this.id = id;
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    }

    public int getId() {        //Getter
        return id;
    }

    public void setId(int id){      //Setter
        this.id = id;
    }

    public String getName(){    //Getter
        return name;
    }

    public void setName(String name) {  //Setter
        this.name = name;
    }

    public int getPrice() {     //Getter
        return price;
    }

    public int getKcal() {      //Getter
        return kcal;
    }

    public void setPrice(int price) {   //Setter
        this.price = price;
    }

    public void setKcal(int kcal) { //Setter
        this.kcal = kcal;
    }
}
