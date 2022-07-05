package mywork;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Stack stack= new Stack();

        stack.add(80);
        stack.add(50);
        stack.add(30);


        System.out.println("Stack here :"+stack);

        Queue queue = new PriorityQueue();
        queue.add(80);
        queue.add(50);
        queue.add(30);

        queue.poll();
        System.out.println(queue.poll());
        System.out.println("Queue here :"+queue);

        HashSet<Integer> list = new HashSet<>();

        list.add(80);
        list.add(50);
        list.add(30);
        System.out.println();
        System.out.println("LinkedHashSet here :" + list);


    }
}
