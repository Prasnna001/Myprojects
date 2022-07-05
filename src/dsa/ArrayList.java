package dsa;

public class ArrayList {

    // Main Method
    public static void main(String[] args)
    {
        java.util.ArrayList<Integer> al = new java.util.ArrayList<Integer>();
        // the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);
        // Printing elements
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
    }
}
