package problem3.linkedlist;

import problem3.node.Node;
import problem3.student.Student;

public class LinkedList {

    private Node head;
    private Node tail;

    public void insertData(Student student) {
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

    public void printData() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            if (temp != tail) {
                System.out.print("--->");
            }
            temp = temp.getNext();
        }
    }
}
