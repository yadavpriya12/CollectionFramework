import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
       List.add(10);
       List.add(20);
       List.add(30);
       List.add(40);
       List.add(50);

       for (Integer integer : List) 
       {
        System.out.println(integer);
       }
    }
}
