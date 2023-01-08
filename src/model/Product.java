package model;
import java.util.Scanner;

public class Product {
    protected int id;
    protected String name;
    protected String description;
    protected int price;
    protected int stock;

    public Product(int id, String name, String description, int price, int stock){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getPrice(){
        return price;
    }

    public int stock(){
        return stock;
    }

    @Override
    public String toString(){
        return "|id: "+id+"|name: "+name+" |description: "+description+" |price: "+price +"|stock: "+stock+"|";
    }

}
