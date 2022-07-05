package Reversing;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String rev =" ";
        System.out.println("Orginal name  : " + name);
        for (int i = name.length() -1; i >=0 ; i--) {

            rev = rev + name.charAt(i);
        }
        System.out.println("reversed name  : " + rev);

    }
}