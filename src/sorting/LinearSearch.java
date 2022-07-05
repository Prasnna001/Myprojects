package sorting;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        // Time and Complexity
        // best case if we find the target at first run -> first index thats best case
        // worst case what if we run million time but still not find the ouput
        // that's worst case o(1);

        int arr[] = {1,5,29,4,2,45,2}; // Linear we can use sorted or unsorted it doesn't matter
        int target =2;
       int ans = linearSearch(arr,target);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
             if(arr[i] == target)
             {
                max =i;
             }
         }
return max;

    }
}
