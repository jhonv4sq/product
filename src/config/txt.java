package config;

import java.io.*;
import java.io.FileReader;

public class txt {

    protected static String binder = "src/database";
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
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
