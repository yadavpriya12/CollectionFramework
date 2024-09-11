import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        q1.add("kashish");
        q1.add("sakshi");
        q1.add("saloni");
        q1.add("payal");
        q1.add("Rukmani");
      
        System.out.println(q1.peek());
         q1.offer("kanita");
         q1.poll();
        System.out.println(q1);
        System.out.println(q1.remove());
        
    }
}
