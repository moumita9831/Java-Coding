public class Palindrome {
    public static void main(String[] args) {
        int a = 121;
        int original = a;
        int reverseNumber1 = 0;

        while (a != 0) {
            reverseNumber1 = reverseNumber1 * 10 + a % 10;
            a = a / 10;
        }

        System.out.println(reverseNumber1==original);
    }
}
