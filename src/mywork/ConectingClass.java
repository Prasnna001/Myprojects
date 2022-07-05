package mywork;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConectingClass {

    static int num;
    public  void show()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList arrayList= new ArrayList();
        System.out.println("Enter your numbers  :");
        num = scanner.nextInt();



        for (int i = 1; i <=num ; i = i+1) {
            arrayList.add(i);

        }
        System.out.println("your list are finally reduced"+arrayList);

    }

}
