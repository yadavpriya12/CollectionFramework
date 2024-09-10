
package com.mycompany.collectionframework;

    import java.util.*;
   public class VectorExample {
    public static void main(String[] args) {

        Vector<Integer> V = new Vector<Integer>();
        System.out.println("=====AddFirst=====");
        V.add(500);
        V.add(501);
        V.add(502);
        V.add(504);
        V.add(505);
        V.add(506);
        V.add(507);
        V.add(508);
        V.add(509);
        
        for (Integer integer : V) {
        System.out.println(integer);
         }
     
        System.out.println("=======AddIndex=======");
        V.add(2, 490);
        V.add(4, 480);
        
        for(Integer integer : V) {
        System.out.println(integer);
        }
     
        
        System.out.println("========RemoveFirst=========");
        System.out.println(V.remove(0));     
       
        System.out.println("=========RemoveIndex=========");
        System.out.println(V.remove(3));
        
        System.out.println("======Clone=======");
     System.out.println(V.clone());
        
     System.out.println("=======contain=========");
     System.out.println(V.contains(15));
           
     System.out.println("======getIndex=======");
     System.out.println(V.get(2));
        
        
     System.out.println("=======Size======");
     System.out.println(V.size());
      
     System.out.println("========is empty=========");
     System.out.println(V.isEmpty());  
        
     System.out.println("===========setvalue============");
     V.set(2, 350);
     System.out.println(V);
    
     System.out.println("=======ElementTravelsForeach=======");
     for (Integer element : V) {
     System.out.println("element is a" + " " + element);   
        }
    
      System.out.println("========Clear=========");
      V.clear();
       
  
 }
}
