public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = {34, 67, 98, 0, 434, 987, 24};
        int l = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (l < arr[i]) {
                s = l;
                l = arr[i];
            }
        }
        System.out.println(s);


    }
}

