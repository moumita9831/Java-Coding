import java.util.HashSet;
import java.util.Set;

public class DuplicateCharecter {
    public static void main(String[] args) {
        Set<Character> c = new HashSet<>();
        String str = "rtgyhygvc";
        for(int i=0; i<str.length(); i++){
            char c1 = str.charAt(i);
            c.add(c1);
        }
        System.out.println(c);
    }
}
