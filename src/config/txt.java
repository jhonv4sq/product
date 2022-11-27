package config;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;

public class txt {

    protected static String binder = "src/database/txt";
    protected static String fileName = "products";

    public static String getPath(String path){
        File file = new File(path);
        return file.getAbsolutePath().replace("\\", "\\\\");
    }

    public void createFile(){
        String pathFile = getPath(binder);
        String newFilePath = getPath(binder+"/"+fileName+".txt");

        try{
            File path = new File(pathFile);
            File file = new File(newFilePath);
            if(!path.exists() || !file.exists()){
                if(path.mkdirs()){
                    System.out.println("Se ha creado la carpeta database");
                }
                if(file.createNewFile()){
                    System.out.println("Se ha creado el archivo: " + fileName);
                    writeIndex(newFilePath, fileName);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void writeIndex(String path, String fileName){

        FileWriter file = null;
        String firstRow = null;
        
        if(fileName.equals("products")){
            firstRow = "id, name, description, price";
        }

        try {
            file = new FileWriter(path);
            PrintWriter pw = new PrintWriter(file);
            pw.print(firstRow);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(file != null){
                    file.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }


}
