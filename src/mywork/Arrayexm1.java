package mywork;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayexm1 {

    public static void main(String[] args) {
/*
        int arr[] ={45,54,323,12,3};
        System.out.println("Orginal here"+Arrays.toString(arr));
        some(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void some(int a[])
    {
        a[0] = 999;

    }*/


    int[][] arr ={{3,4,5},{4,6,7,8},{4,5}};


        for (int row = 0; row <arr.length ; row++) {
            for (int cols = 0; cols < arr[row].length; cols++) {
                System.out.print( arr[row][cols]+ " ");
            }
            System.out.println();



        }


    }}