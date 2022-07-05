package sorting;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {

        // Time and Complexity
        // best case if we find a output in less time running a loop
        //worst case we can't find a output but still iterate through all elements O(logn)



        int [] num = {2,5,6,78,89,98}; // for binary we must use the sorted array so we can iterate easily
        int target =98;
        int ans = binarySearch(num,target);
        System.out.println(Arrays.toString(num)); // toString method convert the array to string and print it
        System.out.println(ans);

    }
    static int binarySearch(int [] arr,int target)
    {
        int start =0;   // starting point of the array
        int end = arr.length-1; // end of the array
        while(start<=end)
        {

            int mid = start + (end - start) / 2; // to find the middle index formula

            if(target < arr[mid])    //check whether our target is less than middle we don't care about the
                                    //greather than middle part of array
            {
                end = mid -1;
            }
            else if(target > arr[mid])
            {
                start = mid +1;
            }
            else{
                return  mid;
            }

        }

     return -1; // when the return statement hits it ends or terminate the Method
    }
}