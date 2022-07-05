package Reversing;

public class Reverseint {

    public static void main(String[] args) {

        int num = 123456789;
        System.out.println("Orginal number"+num);

        int rev=0;
        while(num !=0)
        {
            int remainder = num %10;
            rev = rev *10 + remainder;
            num=  num /10;
        }
        System.out.println("Reversed number " + rev);
    }
}