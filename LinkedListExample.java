
package com.mycompany.collectionframework;

import java.util.LinkedList;


public class LinkedListExample {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
      for(Integer integer : list){
          System.out.println(integer);
      }
      
      
        System.out.println("=======AddIndex======");
        list.add(2, 25);
        for(Integer integer : list){
            System.out.println(integer);
        }
        
     //   System.out.println("=========AddAll==========");
       //list<Integer> newlist = new LinkedList<>();
       
       System.out.println("========RemoveFirst=========");
        System.out.println(list.remove(0));
       
        System.out.println("============RemoveIndex===========");
        System.out.println(list.remove(3));
       
        System.out.println("============Clone============");
        System.out.println(list.clone());
        
        System.out.println("=======Contains======");
        System.out.println(list.contains(30));
        
        System.out.println("=======getFirst======");
        System.out.println(list.getFirst());
        
        System.out.println("=======getIndex======");
        System.out.println(list.get(3));
        
        System.out.println("=========getLast=========");
        System.out.println(list.getLast());
        
        System.out.println("=======inddexof========");
        System.out.println(list.indexOf(60));
       
        System.out.println("=====is empty====");
        System.out.println(list.isEmpty());
        
        System.out.println("===peek==");
        System.out.println(list.peek());
       
        System.out.println("======peekfirst======");
        System.out.println(list.peekFirst()); 
        
        System.out.println("=====peekLast=====");
        System.out.println(list.peekLast());
        
        System.out.println("======poll=====");
        System.out.println(list.poll());
        
        System.out.println("=====pollFirst=====");
        System.out.println(list.pollFirst());
          
        System.out.println("======PollLast======");
        System.out.println(list.pollLast());
    
        System.out.println("=====pop====");
        System.out.println(list.pop());
   
        
        System.out.println("=====Clear=====");
        list.clear();
        
    
    }
}
