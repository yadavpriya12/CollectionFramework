
package com.mycompany.collectionframework;

import java.util.*;
public class LinkedHashSetEx {
    
    public static void main(String[] args) {
        
       LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
        
            list.add(10);
            list.add(11);
            list.add(12);
            list.add(13);
            list.add(14);
            list.add(15);
            list.add(16);
            list.add(17);
            list.add(18);

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
