
package com.mycompany.collection;

   import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Files {
    
    public static String getFileContent(String filePath) throws FileNotFoundException{
         
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        String msg = "";

        while (sc.hasNext()) {
            msg = msg + sc.next() + " ";
        }
        return msg.toLowerCase();
    }
    
    public static ArrayList<Character> getSpecialSymbols(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        ArrayList<Character> specialSymbols = new ArrayList<>();
        
        while(sc.hasNext()){
            specialSymbols.add(sc.next().charAt(0));
        }
        return specialSymbols;
    }
    
    public static ArrayList<String> getStopWords(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        ArrayList<String> stopWords = new ArrayList<>();
        
        while(sc.hasNext()){
           stopWords.add(sc.next());
        }
        return stopWords;
    }
    
}
