package Collection;

import java.util.*;

public class Collectionexample {
    public static void main(String[] args) {

Set<Integer> set = new HashSet<>();
set.add(1001);
set.add(1002);

Iterator iterator = set.iterator();

while(iterator.hasNext())
{
    System.out.println(iterator.next());

}
    }
}
