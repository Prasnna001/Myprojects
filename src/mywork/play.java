package  mywork;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class play {
    public static void main(String[] args) {
        int[] num ={1,2,3,4};

        System.out.println(de(num));

    }
    static boolean de (int []num)
    {
        Set<Integer> set= new HashSet<>();
        for (int i: num) {
            if (!set.add(i))
            {
                return true;
            };
        }
        return false;
    }

}