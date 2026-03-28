package Day5;

import java.util.Arrays;

public class findPairs {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 1, 2, 3};
        int sum = 10;
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length-1;

        while(low<high){
            if(arr[low] + arr[high] < sum ){
                low++;
            }
            else if(arr[low] + arr[high] > sum ){
                high--;
            }
            else if(arr[low] + arr[high] == sum){
                System.out.println(arr[low] + "," + arr[high]);
                low++;
                high--;
            }
        }
    }
}
