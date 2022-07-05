package  sorting;
public class BubbleSorting {
    public static void main(String[] args) {

        int[] arr = {8,2,6,3,5,7,9};

        Bubsort(arr);
        for (int i:
             arr) {
            System.out.print(i);
        }


    }

    private static void Bubsort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j]  < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp;

                }


            }
        }

    }
}