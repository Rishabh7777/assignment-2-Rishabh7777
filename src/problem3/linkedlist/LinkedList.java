package problem3.linkedlist;

import problem3.node.Node;
import problem3.student.Student;

public class LinkedList {

    private Node head;
    private Node tail;

    public void insertAtLast(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
            head.setNext(null);
            tail = head;
        } else {
            tail.setNext(newNode);
            tail = tail.getNext();
        }
    }

    public String deleteFromLast() {
        Node temp = head;
        Node parent = null;
        if (temp == null) {
            return "Queue is empty.";
        }
        while (temp.getNext() != null) {
            parent = temp;
            temp = temp.getNext();
        }
        // after loop parent will point to second last node
        if (parent != null) {
            parent.setNext(null);
        }
        return temp.getData();
    }

    public void printData() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            if (temp != tail) {
                System.out.print(" ---> ");
            }
            temp = temp.getNext();
        }
    }
}
