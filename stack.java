import java.util.Stack;

public class stack 
{
    public static void main(String args[])
     {
        Stack<Integer> Stack = new Stack<>();
        Stack.push(10);
        Stack.push(29);
        Stack.push(30);
        Stack.push(50);
        Stack.forEach(System.out::println);

    }

}