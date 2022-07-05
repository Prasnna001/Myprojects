package Variousbinarysearch;

public class CeillingofNumber {
    public static void main(String[] args) {

        // celling is top of the builing and floor is grounf of the building
        // find the ceilling number that are >= target
        // After the u==finding the target we need to check the element
        // if there is a smallest greater tahn or equal to in the array or not.


        int[] arr = {3,4,55,65,66,88,99,1004,1220,1567,1780,1809,1908,2001,2101}; //sorted array for binary-search
        int target =80;
        int ans = binarySearch(arr,target);
        System.out.println( ans);


    }
    static int binarySearch(int[] arr, int target)
    {
        int  start =0;
        int end =  arr.length-1;
        while(start<=end)
        {
            int mid = start +(end - start) /2;
            if(target < arr[mid])
            {
                end = mid -1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return  mid;
            }
        }

        return arr[start];
    }
}
