package mywork;

public class palindrome {
    public static void main(String[] args) {

        int  sum = 0,temp=0;

        int n =464;

        temp =n;

        while(n>0)
        {
            int remainder =n %10;

            sum = (sum * 10)+ remainder;

            n = n/10;
        }

        if(temp == sum)
        {System.out.println(sum + "is a palindrome number");}
        else System.out.println("not palindrome number");
    }
}