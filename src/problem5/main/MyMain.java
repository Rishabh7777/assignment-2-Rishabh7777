/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {

        MyCircularQueue circularQueue = new MyCircularQueue(5);

        circularQueue.insertInQueue(new Student("Ajay", 2, 0));
        circularQueue.insertInQueue(new Student("Rahul", 1, 1));
        circularQueue.insertInQueue(new Student("Sonu", 0, 0));
        circularQueue.insertInQueue(new Student("Amit", 2, 2));
    }
}
