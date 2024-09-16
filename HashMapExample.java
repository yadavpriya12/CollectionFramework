import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
   public static void main(String[] args) {
    HashMap<String,String> hs = new HashMap<>();
    hs.put("s01", "saloni");
    hs.put("s02", "nikita");
    hs.put("s03", "sakshi");
    hs.put("s04", "aarchna");
    hs.put("s05", "kashish");
    hs.put("s06", "payal");

    for(Map.Entry<String,String> entry:hs.entrySet())
    {
     String k =entry.getKey();
     String v = entry.getValue();
     System.out.println("key is="+k +"  value is="+v);   
    }


    System.out.println("=======get======");
    System.out.println(hs.get("s02"));

    System.out.println("=========Containskey=========");
    System.out.println(hs.containsKey("s06"));

    System.out.println("=========containsvalue===========");
    System.out.println(hs.containsValue("nikita"));

      System.out.println("=================");
      System.out.println(hs.getClass());



    System.out.println("===========remove======");
    System.out.println(hs.remove("s04"));
    System.out.println(hs);


   } 
}
