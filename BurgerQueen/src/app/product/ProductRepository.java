package app.product;

import app.product.subproduct.Drink;
import app.product.subproduct.Hamburger;
import app.product.subproduct.Side;

public class ProductRepository {
    private  final Product[] products = {
            // since the product information does not change while the program is running, so it is designated as a constant
            new Hamburger(1, "새우버거", 3500, 500, false, 4500),
            new Hamburger(2, "치킨버거", 4000, 600, false, 5000),
            new Side(3, "감자튀김", 1000, 300, 1),
            new Side(4, "어니언링", 1000, 300, 1),
            new Drink(5, "코카콜라", 1000, 200, true),
            new Drink(6, "제로콜라", 1000, 0, true),
    };

    public Product[] getAllProducts() { // created a getter because products can be accessed from the out class
        return products;
    }

    public Product findById(int productId){ //defined findById method
        for (Product product : products){   //Iterated products Array
            if (product.getId() == productId) return product; // Return the product if it matches the ID received as a parameter.
        }
        return null;
    }
}
