import java.util.*;
import java.util.stream.Collectors;
public class prime {
    public static boolean isprime(int num) {
        boolean prime = true;
        for(int i= num - 1;i > 1;i--)
        {
            if(num % i== 0)
            prime = false;
        }
        return prime;
    }
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();

        list.add(17);
        list.add(11);
        list.add(19);
        list.add(10);

        list.stream().filter(e->(isprime(e)))
              .collect(Collectors.toList())
              .forEach(System.out::println);
    }

}