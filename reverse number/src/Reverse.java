

public class Reverse {
    public static void main(String[] args) {
        int n = 1212;
        int reverseNumber = 0;

        while (n != 0) {
            reverseNumber = reverseNumber * 10 + n % 10;
            n = n / 10;
        }

        System.out.println(reverseNumber);


    }
}
