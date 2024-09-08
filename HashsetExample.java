
package com.mycompany.collectionframework;
import java.util.HashSet;

public class HashsetExample {
    
    public static void main(String[] args) {

  HashSet<Integer> list = new HashSet<Integer>();
  
         list.add(10);
         list.add(11);
         list.add(20);
         list.add(30);
         list.add(41);
         list.add(42);
         
         
     for (Integer integer : list) {
     System.out.println(integer);   
        }
       
        System.out.println("=======clone=======");
        System.out.println(list.clone());
        
        System.out.println("=========Contains==========");
        System.out.println(list.contains(30));
                
        System.out.println("========Is Empty========");
        System.out.println(list.isEmpty());
        
        System.out.println("=======remove=======");
        System.out.println(list.remove(11));
        
        
        System.out.println("========Size========");
        System.out.println(list.size());
        
        System.out.println("========Clear========");
        list.clear();
             
        System.out.println("========Is Empty========");
        System.out.println(list.isEmpty());

           
    }
}




