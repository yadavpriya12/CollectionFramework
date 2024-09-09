
package com.mycompany.collectionframework;
   import java.util.Stack;
public class Stack1 {
    
    public static void main(String[] args) {
        
    Stack<Integer>s = new Stack<>();
        System.out.println("=====add======");
            s.add(5);
            s.add(10);
            s.add(15);
            s.add(25);
            s.add(30);
            s.add(45);
        System.out.println(s);
        
     
        System.out.println("=====elementsAtIndex====== ");
        System.out.println(s.elementAt(0));
       
        
       System.out.println(" ====elements=====");
        s.elements();
        System.out.println(s);
       
       
        System.out.println("=====push(addelemnt)=====");
      
         s.push(11);
         s.push(22);
         s.push(33);
         System.out.println(s);
          

         System.out.println("========peek (show last element)=========");
         System.out.println(s.peek());
         
         
           System.out.println("=====pop remove element======");
           s.pop();
           System.out.println( s);
         
           
       
    }
    
}
    
