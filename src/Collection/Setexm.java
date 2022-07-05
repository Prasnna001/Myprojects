package Collection;

import java.util.HashSet;
import java.util.Set;

public class Setexm {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(100);
        set.add(101);
        set.add(103);
        if(set.contains(101)){
            set.remove(101);
        }

        System.out.println(set);
    }
}
