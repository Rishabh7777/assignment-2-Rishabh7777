/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties

public class Student extends problem3.student.Student {

    private int backLog;

    // constructor
    public Student(String name, int rollNUmber, int backLog) {
        super(name, rollNUmber);
        this.backLog = backLog;
    }


}
