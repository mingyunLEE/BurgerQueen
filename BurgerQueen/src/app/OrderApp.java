package app;

import app.product.Product;
import app.product.ProductRepository;

import java.util.Scanner;

public class OrderApp {

    public void start() {   //When the variable of OrderApp start

        Scanner scanner = new Scanner(System.in); // instantiate scanner class

        ProductRepository productRepository = new ProductRepository();  // created the repository instance
        Product[] products = productRepository.getAllProducts();    // Returns the value of the productRepository as a getter in the products array
        Menu menu = new Menu(products);    //create menu instance
        Cart cart = new Cart(productRepository, menu);

        System.out.println("🍔 BurgerQueen Order Service");
        while (true){
            menu.printMenu();
            String input = scanner.nextLine(); // Declaring the input variable using scanner method

            if(input.equals("+")){
                break;
            }else {
                int memNumber = Integer.parseInt(input);

                if (memNumber == 0) cart.printCart();
                else if (1 <= memNumber && memNumber <=products.length) cart.addToCart(memNumber);
            }

        }


    }

}
