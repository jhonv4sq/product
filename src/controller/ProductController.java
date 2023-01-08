package controller;

import model.*;


public class ProductController extends Controller{

    public void store(String name, String description, int price, int stock){
       Product products = new Product(name, description, price, stock);
       super.productList.add(products);
    }

    public void update(Product product){

    }

    public void show(Product product){

    }

    public void delete(Product product){

    }

    public void index(){
        clear();
        for(Product product : super.productList){
            System.out.println(product);
        }
    }

}
