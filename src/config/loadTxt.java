package config;

import config.txt.*;
import java.util.ArrayList;
import controller.ProductController;

public class loadTxt {
    public static void loadProduct(ProductController products){
        String binder = "src/database/txt";
        String fileName = "products";
        String firstRow = "id, name, description, price, stock";
        ArrayList<ArrayList<String>> List = null;

        txt text = new txt();
        text.createFile(binder, fileName, firstRow);
        List = text.getDataFromTxt(binder, fileName);

        for(int i=0;i<List.size();i++){
            String name = List.get(i).get(1);
            String description = List.get(i).get(2);
            int price = Integer.valueOf(List.get(i).get(3));
            int stock = Integer.valueOf(List.get(i).get(4));
            products.load(name, description, price, stock);
        }
    }

    public loadTxt(ProductController products){
        loadProduct(products);
    }
}
