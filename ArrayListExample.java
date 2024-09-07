
package com.mycompany.collectionframework;


 import java.util.*;
public class ArrayListExample {
   
  
 public static void main(String[] args) {
   
ArrayList<String> color = new ArrayList<>();
     System.out.println("=======add=======");
     color.add("red");
     color.add("black");
     System.out.println(color);   

     
  ArrayList<Integer> list = new ArrayList<>();
  System.out.println("==========Add===========");
  list.add(10);
  list.add(11);
  list.add(13);
  list.add(14);
  list.add(15);
  list.add(16); 
  for(Integer integer : list ){
           System.out.println(integer);
       }
     
  
      System.out.println("============Addindex============"); 
      list.add(2,12);
      for(Integer integer : list){
       System.out.println(integer);
        }
      
     System.out.println("=======addAll======");
     List<Integer> newlist = new ArrayList<>();
     list.add(100);
     list.add(200);
     newlist.addAll(newlist);
     System.out.println(list);
     
     
     System.out.println("========ElementTraverse=====");
     for (Integer i = 0; i < list.size(); i++){ 
     System.out.println("Element is a" + " " + list.get(i));
            
        }
          
     System.out.println("==========RemoveAll=========");
     System.out.println(list.removeAll(newlist));
        
       
     System.out.println("=======RemoveFirst======="); 
     System.out.println(list.remove(0));
       
        
     System.out.println("========RemoveIndex=========");
     System.out.println(list.remove(2));
     
          
     System.out.println("======Clone=======");
     System.out.println(list.clone());
        
     System.out.println("=======contain=========");
     System.out.println(list.contains(15));
           
     System.out.println("======getIndex=======");
     System.out.println(list.get(2));
        
        
     System.out.println("=======Size======");
     System.out.println(list.size());
      
     System.out.println("========is empty=========");
     System.out.println(list.isEmpty());  
        
     System.out.println("===========setvalue============");
     list.set(2, 350);
     System.out.println(list);
    
     System.out.println("=======ElementTravelsForeach=======");
     for (Integer element : list) {
     System.out.println("element is a" + " " + element);   
        }
    
      System.out.println("========Clear=========");
      list.clear();
       
  
     }     
    }
