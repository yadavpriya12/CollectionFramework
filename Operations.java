
package com.mycompany.collection;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Operations {
    
    public static String removeSymbols(String inputString) throws FileNotFoundException {
        char charArray[] = inputString.toCharArray();
        ArrayList<Character> charList = new ArrayList();

        for (char c : charArray) {
            charList.add(c);
        }
        ArrayList<Character> symbolList = Files.getSpecialSymbols("C:\\Users\\ayush malakar\\Documents\\CollectionFrameWorkFiles\\SpecialSymbols.txt");
        charList.removeAll(symbolList);
        inputString = "";
        for (Character character : charList) {
            inputString = inputString + character;
        }
        return inputString;
        
    }
    
    
    public static String removeStopWords(String inputString) throws FileNotFoundException{
        String stringArray[] = inputString.split(" ");
        ArrayList<String> stringList = new ArrayList();
        
        for(String s:stringArray){
            stringList.add(s);
        }
        
        ArrayList<String> stopWords = Files.getStopWords("C:\\Users\\ayush malakar\\Documents\\CollectionFrameWorkFiles\\StopWords.txt");
        stringList.remove(stopWords);
        
        inputString = " ";
        for(String s : stringList){
            inputString = inputString + s +" ";
        }
        return inputString;
    }
    
    
} 
    
