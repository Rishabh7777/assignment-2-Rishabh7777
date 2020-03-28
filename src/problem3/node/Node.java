package problem3.node;/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */

public class Node {

    private String name;
    private int rollNumber;
    private Node next;  // pointer to next node

    // constructor
    public Node(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        next = null;    // initially next pointing to null
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
