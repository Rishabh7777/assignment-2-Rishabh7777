/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.linkedlist.LinkedList;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insertData(new Student("Rahul", 34));
        linkedList.insertData(new Student("Amit", 2));
    }
}
