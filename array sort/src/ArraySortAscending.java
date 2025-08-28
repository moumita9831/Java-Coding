public class ArraySortAscending {
    public static void main(String[] args) {
        int[] arr = {67, 89, 45, 4555, 98, 34, 56};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ",");
        }
    }
}
