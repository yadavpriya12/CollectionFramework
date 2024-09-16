import java.util.HashSet;

public class HashsetExample
 {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>();
        h1.add("java");
        h1.add("saloni");
        h1.add("css");
        h1.add("python");
        h1.add("css");
        h1.add("java");
        h1.add("kanita");

        for (String string : h1) {
           System.out.println(string); 
        }
        
        System.out.println(h1.getClass());

        System.out.println("contains="+h1.contains("c"));
        
        System.out.println("Size= "+h1.size());
        System.out.println(h1);
       
    }
}

