package com.company.PracticeProblems;


// Find the middle element in a linked list
public class LinkedListMiddleElement {

    public static void main(String args[]) {

        LinkedList linkedlist = new LinkedList();

        for(int i = 9; i > 0; i--) {
            linkedlist.push(i);
        }
        linkedlist.printMiddle();
    }
}

class LinkedList {
    Node head;

    void printMiddle() {
        Node slow = head;
        Node fast = head;
        // fast is going double the speed as slow. This will allow us to find the middle
        if(head != null){
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }


        }
        System.out.println("Middle element is: " + slow.data);
    }


    public void push(int data) {
        Node node = new Node(data);
        // make new node the head of list
        node.next = head;
        // move head to point to new node.
        head = node;
    }

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
}
