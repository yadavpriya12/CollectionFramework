

package com.mycompany.collection;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Collection {

    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("************ INPUT STRING LIST ************");
        String inputString = Files.getFileContent("C:\\Users\\ayush malakar\\Documents\\CollectionFrameWorkFiles\\InputFile.txt");
        System.out.println(inputString);
        
        
        System.out.println();
        System.out.println("************ SPECIAL SYMBOLS LIST ************");
        ArrayList <Character> spacialSymbols= Files.getSpecialSymbols("C:\\Users\\ayush malakar\\Documents\\CollectionFrameWorkFiles\\SpecialSymbols.txt");
        System.out.println(spacialSymbols);
        
        
        System.out.println();
        System.out.println("************ STOP WORDS LIST ************");
        ArrayList<String> stopWords = Files.getStopWords("C:\\Users\\ayush malakar\\Documents\\CollectionFrameWorkFiles\\StopWords.txt");
        System.out.println(stopWords);
        
        
        System.out.println();
        System.out.println("************ REMOVE SPECIAL SYMBOLS ************");
        inputString = Operations.removeSymbols(inputString);
        System.out.println(inputString);
        
        
        System.out.println();
        System.out.println("************ REMOVE STOP WORDS ************");
        inputString = Operations.removeStopWords(inputString);
        System.out.println(inputString);
    }
}
