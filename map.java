import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name","balu");
        map.put("name2","noor");
        map.forEach((a, b) -> System.out.println(a+ ":"+b));
    }
}