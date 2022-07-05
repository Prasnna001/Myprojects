package Integer;

public class Primenumbers {
    public static void main(String[] args) {

        int num = 1270; // check the number if it is prime or not
        boolean flag    =false;
        int m = num/2;



        if(num==0||num==1)
        {
            System.out.println(num + "is a prime number");
        }
        else
        {
            for (int i = 2; i <m; i++) {
                System.out.println(num +"is not prime number");
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println(num +"is a prime number");
        //else System.out.println(num +"is not prime number");


    }
}