import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccurrenceCharacter {
    public static void main(String[] args) {
//        String str = "yy";
//        Map<Character, Integer> map = new HashMap<>();
//
//        for(int i = 0; i< str.length(); i++){
//            char c = str.charAt(i);
//            if(map.containsKey(c)){
//                map.put(c, map.get(c)+1);
//            }
//            else{
//                map.put(c, 1);
//            }
//        }
//        System.out.println(map);


        Set<Character> c = new HashSet<>();
        String str = "rtgyhygvc";
        for(int i=0; i<str.length(); i++){
            char c1 = str.charAt(i);
            c.add(c1);
        }
        System.out.println(c);

    }
}