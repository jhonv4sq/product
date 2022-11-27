package views;

import java.util.Scanner;
import controller.ProductController;

import views.products.*;;

public class ini {
    public ini(){
        Scanner input = new Scanner (System.in);
        Boolean exit = false;

        ProductController products = new ProductController();
        products.clear();
        String options = "\n1) Agregar Nuevo \n2) Mostrar todo \n3) Salir";
        while(exit != true){
            
            System.out.println(options);
    
            int res = Integer.parseInt(input.nextLine());
    
            switch(res){
                case 1: 
                    create createView = new create(products);
                    break;
                case 2:
                    index indexView = new index(products);
                    break;
                case 3:
                    exit = true;
            }
        }
    }
}
