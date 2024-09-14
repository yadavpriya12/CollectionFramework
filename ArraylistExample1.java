import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistExample1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("html");
        list.add("ruby");
        list.add(3, "Golang");
        //list.set(2,"c" );
       //     list.remove(2);
       //    list.clear();
        // System.out.println(list.isEmpty());
        //  System.out.println(list);
        //  System.out.println( list.contains("java"));
          //System.out.println(list.get(1));

        //   for(int i=0;i<list.size();i++)
        //   {
        //    System.out.println(list.get(i));
        //   }

          for (String str: list) {
            System.out.println(str);
          }

          List<String> obj = Collections.unmodifiableList(list);
         //obj.add("priya");
          System.out.println(obj);

          
    }
}
