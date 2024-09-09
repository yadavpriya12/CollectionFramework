
package com.mycompany.collectionframework;
import java.util.*;

  public class PriorityQueueEx {
    public static void main(String[] args) {
        
    PriorityQueue<Integer> list= new PriorityQueue<Integer>();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.add(50);
       
                
       for (Integer integer : list) {
           System.out.println(integer);
           
          
           System.out.println("============Remove===========");
           System.out.println(list.remove());
           
            System.out.println("========Contains=========");  
           System.out.println(list.contains(30));
           
           
           
       }        
        }
    }
