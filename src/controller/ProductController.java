package controller;

import model.*;
import java.util.ArrayList;


public class ProductController extends Controller{
    protected ArrayList<Product> productList = new ArrayList<Product>();
    
    public void load(int id, String name, String description, int price, int stock){
       Product products = new Product(id, name, description, price, stock);
       this.productList.add(products);
    }

    public void store(String name, String description, int price, int stock){
       Product products = new Product(productList.size(), name, description, price, stock);
       this.productList.add(products);
    }

    public void update(Product product){

    }

    public void show(Product product){

    }

    public void delete(Product product){

    }

    public void index(){
        clear();
        for(Product product : this.productList){
            System.out.println(product);
        }
    }

}
