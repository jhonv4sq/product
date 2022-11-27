package views.products;

import java.util.Scanner;
import controller.ProductController;

public class create {
    static Scanner input = new Scanner (System.in);
    public create(ProductController Product){
        Product.clear();
        System.out.print("Nombre del articulo: ");
        String name = input.nextLine();
        System.out.print("Nombre del descripcion: ");
        String description = input.nextLine();
        System.out.print("Nombre del precio: ");
        int price = Integer.parseInt(input.nextLine());
        Product.store(name, description, price);
    }
}
