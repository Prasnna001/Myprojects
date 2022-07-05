package Collection;

import javax.swing.undo.CannotUndoException;

public class CustomLinkedList {
    private class Node {
        int data;
        Node next;
    }

    Node head;

    public Node duplicate() {
        Node node = head;
        while (node != null) {
            if (node.next == null) break;
            if (node.data == node.next.data) {
                node.next = node.next.next;
            } else node = node.next;
        }
        return head;
    }

    public void insert(int val) {
        Node node = new Node();
        node.data = val;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void show() {
        Node node = head;
        System.out.print("[");
        while (node != null) {
            System.out.print(node.data + ",");
            node = node.next;
        }
        System.out.print("]");


    }

    public void insertFirst(int val) {
        Node node = new Node();
        node.data = val;
        node.next = head;
        head = node;

    }
    public void insertat(int index,int val)
    {
   Node node =new Node();
   node.data=val;
   node.next =null;
   Node n = head;
   if(index ==0) {insertFirst(val);}
        for (int i = 0; i < index-1; i++) {
            n=n.next;
        }
        node.next = n.next;
        n.next = node;
    }
}
