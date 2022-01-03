import java.util.*;
public class printnumbers {
   public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(12);
        stack.push(11);
        stack.push(42);
        stack.push(152);
        stack.push(111);
        stack.push(151);

        stack.stream()
          .filter(e->(e % 2!=0))
          .forEach(System.out::println);

    }

}