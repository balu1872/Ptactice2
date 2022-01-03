import java.util.*;
import java.util.stream.Collectors;
public class palindrome {
    public static boolean ispalindrome(int num) {
        String s= num + " ";
        String r= " ";
        for(int i = s.length() - 1;i>0;i--){
          r +=s.charAt(i);
    }
    if(s.equals(r)){
        return true;
    } return false;



    }
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(132);
    list.add(1432);
    list.add(1441);
    list.add(1542);
    list.add(1234321);

    list.stream()
         .filter(e->(ispalindrome(e)))
         .collect(java.util.stream.Collectors.toList())
         .forEach(System.out::println);

}

}