package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapexm {
    public static void main(String[] args) {

        // Map is Interface
        //hashtable it stores data in table format
        // hashtable have key and value
        // usig key we have acesss to the value that we stored

        Scanner scanner=new Scanner(System.in);
        Map<Integer,String> map = new HashMap<>(); //creating hashtable
        map.put(1,"Steven Smith");
        map.put(2,"Virat Kholi");
        map.put(3,"Dhoni");
        map.put(4,"Rohit sharma"); // assinging values
        map.put(5,"Joe root");

        System.out.println("ICC Men's Top Ranking ");
        System.out.print("Type the rank  -> ");
        int rank = scanner.nextInt(); // taking the inputs

        System.out.println(map.get(rank)); // passing the input to map like key


    }
}
