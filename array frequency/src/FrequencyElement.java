import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyElement {
    public static void main(String[] args) {
        int arr[] ={34, 78, 98, 56, 34};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i= 0; i< arr.length; i++){
          int r = arr[i];
          if(frequencyMap.containsKey(r)){
              frequencyMap.put(r, frequencyMap.get(r)+1);
          }
          else {
              frequencyMap.put(r,1);
          }
        }
        System.out.println(frequencyMap);

    }
}
