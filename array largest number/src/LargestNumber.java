public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {-1, -78, 0, 1};
        int large = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > large) {
                large = element;
            }
        }
        System.out.println(large);
    }
}
