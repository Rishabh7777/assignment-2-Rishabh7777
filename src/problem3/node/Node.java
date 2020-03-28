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


}
