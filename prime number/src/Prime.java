

public class Prime {
    public static void main(String[] args) {
        int n = 11;
        if (n <= 1) {
            System.out.println("Please enter a number bigger than 1");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Non-Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
