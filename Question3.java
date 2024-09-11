import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question3 {
    public static void main(String[] args) {

        ArrayList<Integer> L1 = new ArrayList<>();
        Collection<Integer> L2 = new ArrayList<>();
        L1.add(10);
        L1.add(20);
        L1.add(30);
        L1.add(40);
        L1.add(50);
        L1.add(0, 4);
        System.out.println(L1);
        System.out.println("L1");

        ArrayList<Integer> L3 = new ArrayList<>();
        L3.add(10);
        L3.add(40);
        L3.add(50);
        System.out.println(L3);
        System.out.println("L3");


        System.out.println("Question-4");
        System.out.println("========retrieve/get========");
        System.out.println(L1.get(1));


        System.out.println("Question-5");
        System.out.println("========update========");
        L1.add(4, 23);
        L1.add(3, 90);


        System.out.println("Question-6");
        System.out.println("==========Remove3Element==========");
        System.out.println(L1.remove(2));


        System.out.println("Question-7");
        System.out.println("==========Search===========");
        System.out.println("40"+L1.contains(40));


        System.out.println("Question-8");
        System.out.println("=======Sort========");
          Collections.sort(L1);
          System.out.println(L1);

          System.out.println("Question-9");
          System.out.println("========Copy========");
          System.out.println(L1.clone());

          System.out.println("Question-11");
          System.out.println("======ReverseElement=======");
          Collections.reverse(L1);
          System.out.println(L1);

          System.out.println("Question-10");
          System.out.println("=======Shuffle=======");
          Collections.shuffle(L1);
          System.out.println(L1);

          System.out.println("Question-12");
        System.out.println("======Compare========");
        System.out.println(L1.equals(L2));


        System.out.println("Question-13");
        System.out.println("======Swap======");
        Collections.swap(L1, 2, 3);
        System.out.println(L1);

        System.out.println("Question-14");
        System.out.println("==========TrimingCapacity========");
        L1.trimToSize();
           System.out.println(L1);


            System.out.println("Question-15");
           System.out.println("========Arraylist==========");
           for (Integer integer : L1) 
           {
            System.out.println(integer);
           }

    

    }
}
