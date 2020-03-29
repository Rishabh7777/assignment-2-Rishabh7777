/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node {

    private Student data;
    private Node next;

    // constructor
    public Node(Student data, Node next) {
        this.data = data;
        this.next = next;
    }
}
