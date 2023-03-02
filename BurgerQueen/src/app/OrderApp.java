package app;

import app.product.Product;
import app.product.ProductRepository;

public class OrderApp {

    public void start() {   //When the variable of OrderApp start
        ProductRepository productRepository = new ProductRepository();  // created the repository instance
        Product[] products = productRepository.getAllProducts();    // Returns the value of the productRepository as a getter in the products array
        Menu menu = new Menu(products);    //create menu instance

        System.out.println("🍔 BurgerQueen Order Service");

        menu.printMenu();
    }

}
