import java.util.Set;

public class ConsonantCount {
    public static void main(String[] args) {
        Set<Character> vowel = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        String str = "trhsklciydg";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!vowel.contains(c)) {
              count = count + 1;
            }
        }
        System.out.println(count);
    }
}
