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
        System.out.println("[🔻] 메뉴");
        System.out.println("-".repeat(60));

        printHamburgers(true);
        printSides(true);
        printDrinks(true);
        System.out.println();
        System.out.println("🧺 (0) 장바구니");
        System.out.println("📦 (+) 주문하기");
        System.out.println("-".repeat(60));
        System.out.print("[📣] 메뉴를 선택해주세요 : ");
    }

    protected void printDrinks(boolean printPrice) {
        System.out.println("🥤 음료");
        for (Product product : products){   // Iterate through the length of the products
            if(product instanceof Drink){   // Returns ture if product instance is an instance of hamburger
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    protected void printSides(boolean printPrice) {
        System.out.println("🍟 사이드");
        for (Product product : products){   // Iterate through the length of the products
            if(product instanceof Side){   // Returns ture if product instance is an instance of hamburger
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    private void printHamburgers(boolean printPrice) {
        System.out.println("🍔 햄버거");
        for (Product product : products){   // Iterate through the length of the products
            if(product instanceof Hamburger){   // Returns ture if product instance is an instance of hamburger
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    private static void printEachMenu(Product product, boolean printPrice) {
        if (printPrice) System.out.printf("   (%d) %s %5dKcal %5d원\n", product.getId(), product.getName(), product.getKcal(), product.getPrice());
        else System.out.printf("   (%d) %s %5dKcal\n", product.getId(), product.getName(), product.getKcal());
    }
}
