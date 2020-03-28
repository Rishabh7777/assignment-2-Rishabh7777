package problem3.node;/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */

import problem3.student.Student;

public class Node {

    private Student data;
    private Node next;  // pointer to next node

    // constructor
    public Node(Student data) {
        this.data = data;
        this.next = null;    // initially next pointing to null
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
