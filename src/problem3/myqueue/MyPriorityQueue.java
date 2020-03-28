/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.linkedlist.LinkedList;
import problem3.student.Student;

public class MyPriorityQueue {

    LinkedList linkedList = new LinkedList();

    public void insertInQueue(Student student) {
        linkedList.insertAtLast(student);
    }

    public String deleteFromQueue() {
        return linkedList.deleteFromBeginning();
    }

    public void printQueue() {
        linkedList.printData();
    }
}
