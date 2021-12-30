import java.util.Arraydeque;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {
        Queue <String> q = new ArrayDeque<>();
        q.offer("balu");
        q.offer("balaji");
        q.offer("paidikathula");

        q.forEach(System.out::println);


    }

}