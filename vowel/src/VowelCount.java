import java.util.Set;

public class VowelCount {
    public static void main(String[] args) {
        Set<Character> vowel = Set.of('A','E','I','O','U','a','e','i','o','u');
        String str = "kelopagxi";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
          if (vowel.contains(c)){
              count++;
          }
        }
        System.out.println(count);
    }
}
