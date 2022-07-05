package Integer;

public class twosum {

int[] arr ={2,7,5,1,6};
    public int [] some(int[] arr, int target)
    {
        int len= arr.length;
        int[] ans ={-1,-1};

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {

                if(arr[i] + arr[j] == target)
                {
                    ans[0] =j;

                }

            }
        }
        for (int b:ans
             ) {
            System.out.println(b);
        }
        return ans;
    }



    public static void main(String[] args) {
        twosum d = new twosum();
        int[] array = d.arr;

        d.some(array, 9);

    }
}
