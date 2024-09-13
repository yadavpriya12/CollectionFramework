import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
       LinkedList<String> L1 = new LinkedList<>();
       L1.add("java");
       L1.add("C++");
       L1.add("Html");
       L1.add("css");
       L1.add("python");
       System.out.println(L1);

       LinkedList<String> L2 = new LinkedList<>();
       L2.add("C++");
       L2.add("Html");
       L2.add("css");
       L2.add("python");

       System.out.println(L2);

       System.out.println("===AddFirst====");
       L1.addFirst("c");
        System.out.println(L1);


        System.out.println("=====AddIndex=====");
        L1.add(2, "Hello");
        System.out.println(L1);

       System.out.println("====AddLast====");
       L1.addLast("Priya");
       System.out.println(L1);

        System.out.println("===getfirst======");
        System.out.println(L1.getFirst());


        System.out.println("=====getIndex====");
        System.out.println(L1.get(3));


       System.out.println("====getlast=====");
       System.out.println(L1.getLast());

          System.out.println("=====equal====");
          System.out.println(L1.equals(L2));

          System.out.println("====clone===");
          System.out.println(L1.clone());

          
          Collections.unmodifiableList(L1);
          L1.add("hii");
          L1.set(3, "pihu");
          System.out.println(L1);

          System.out.println("======Contains======");
          System.out.println(L1.contains("pihu"));
          
          System.out.println("========containsAll=======");
          System.out.println(L1.containsAll(L2));

          System.out.println("=======Set======");
          L1.set(2, "Kanita");
          System.out.println(L1);
           
             System.out.println("-=====Element=======");
             System.out.println(L1.element());

          System.out.println("======getclass========");
          System.out.println(L1.getClass());
          
          System.out.println("=====IndexOf======");
          System.out.println(L1.indexOf("pihu"));

          System.out.println("======IsEmpty=========");
          System.out.println(L1.isEmpty());


          System.out.println("=======offer========");
          System.out.println(L1.offer("sonali"));
          System.out.println(L1);

          System.out.println("=====unmodifidiableList=====");
         List<String> list = Collections.unmodifiableList(L1);
        //list.add("sonali");
         System.out.println(list);

           }
}
