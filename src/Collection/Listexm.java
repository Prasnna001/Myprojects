package Collection;

public class Listexm {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.insert(100);
        list.insert(102);
        list.insert(103);
        list.insert(103);
        list.insertFirst(100); // it insert value at first
        //list.insertat(0,20);
        list.duplicate(); //it remove the repeated value in List
        list.show();

    }

}
