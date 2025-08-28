public class SmallestNumber {
    public static void main(String[] args) {
        int [] arr = {6, 87, 5, -8, 45, -2, -9, -76};
        int small = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element < small) {
                small = element;
            }
        }
        System.out.println(small);
    }
}
