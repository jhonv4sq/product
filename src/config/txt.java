package config;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;

public class txt {

    public static String getPath(String path){
        File file = new File(path);
        return file.getAbsolutePath().replace("\\", "\\\\");
    }

    public void createFile(String binder, String fileName, String firstRow){
        String pathFile = getPath(binder);
        String newFilePath = getPath(binder+"/"+fileName+".txt");

        try{
            File path = new File(pathFile);
            File file = new File(newFilePath);
            if(!path.exists() || !file.exists()){
                if(path.mkdirs()){
                    System.out.println("Se ha creado la carpeta: txt");
                }
                if(file.createNewFile()){
                    System.out.println("Se ha creado el archivo: " + fileName);
                    writeIndex(newFilePath, firstRow);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void writeIndex(String path, String firstRow){
        FileWriter file = null;

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

    public static ArrayList<ArrayList<String>> getDataFromTxt(String binder, String fileName){
        ArrayList<ArrayList<String>> List = new ArrayList<ArrayList<String>>();
        String path = getPath(binder+"/"+fileName+".txt");

        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                if(count != 0){
                    List.add(new ArrayList<String>());
                    for(String data : line.split(", ")){
                        List.get(List.size()-1).add(data);
                    }
                }
                count++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return List;
    }

    public static void updateTxt(){

    }
}
