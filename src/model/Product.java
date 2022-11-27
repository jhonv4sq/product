package model;
import java.util.Scanner;

public class Product {
    protected String name;
    protected String description;
    protected int price;

    public Product(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
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

    @Override
    public String toString(){
        return "|name: "+name+" |description: "+description+" |price: "+price +"|";
    }

}
