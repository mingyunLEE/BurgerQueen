package app;

import app.product.Product;
import app.product.subproduct.Drink;
import app.product.subproduct.Hamburger;
import app.product.subproduct.Side;

public class Menu {
    private Product[] products; //When instantiating the Menu class, if ProductRepository's products are passed as an argument,
                                //ProductRepository's products are assigned to Menu's products.

    public Menu(Product[] products) {   //default constructor of Menu class
        this.products = products;
    }

    public void printMenu() {       //printMenu method of Menu
        System.out.println("[๐ป] ๋ฉ๋ด");
        System.out.println("-".repeat(60));

        printHamburgers(true);
        printSides(true);
        printDrinks(true);
        System.out.println();
        System.out.println("๐งบ (0) ์ฅ๋ฐ๊ตฌ๋");
        System.out.println("๐ฆ (+) ์ฃผ๋ฌธํ๊ธฐ");
        System.out.println("-".repeat(60));
        System.out.print("[๐ฃ] ๋ฉ๋ด๋ฅผ ์ ํํด์ฃผ์ธ์ : ");
    }

    protected void printDrinks(boolean printPrice) {
        System.out.println("๐ฅค ์๋ฃ");
        for (Product product : products){   // Iterate through the length of the products
            if(product instanceof Drink){   // Returns ture if product instance is an instance of hamburger
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    protected void printSides(boolean printPrice) {
        System.out.println("๐ ์ฌ์ด๋");
        for (Product product : products){   // Iterate through the length of the products
            if(product instanceof Side){   // Returns ture if product instance is an instance of hamburger
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    private void printHamburgers(boolean printPrice) {
        System.out.println("๐ ํ๋ฒ๊ฑฐ");
        for (Product product : products){   // Iterate through the length of the products
            if(product instanceof Hamburger){   // Returns ture if product instance is an instance of hamburger
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    private static void printEachMenu(Product product, boolean printPrice) {
        if (printPrice) System.out.printf("   (%d) %s %5dKcal %5d์\n", product.getId(), product.getName(), product.getKcal(), product.getPrice());
        else System.out.printf("   (%d) %s %5dKcal\n", product.getId(), product.getName(), product.getKcal());
    }
}
