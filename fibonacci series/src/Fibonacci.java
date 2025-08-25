public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            b = a + b;  // sum first
            a = b - a;  // then shift
        }

    }
}
