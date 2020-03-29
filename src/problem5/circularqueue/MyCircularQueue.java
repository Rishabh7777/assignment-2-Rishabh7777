/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {

    private Student[] circularQueue;
    private int front;
    private int rear;
    private int size;

    public MyCircularQueue(int sizeOfArray) {
        circularQueue = new Student[sizeOfArray];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void insertInQueue(Student data) {
        if (rear < circularQueue.length) { // queue.length will always equal to initialised size of queue
//            System.out.println(queue.length);
            circularQueue[rear] = data;
            rear++;
            size++;
            if (rear == circularQueue.length && size < circularQueue.length) {
                rear = 0;
            }
        } else {
            System.out.println("Queue is full.");
        }
    }

    public void deleteFromQueue() {
        if (!isEmpty() && circularQueue[front].getBackLog() == circularQueue[front].getAppearingCount()) {
            front++;
            size--;
            if (front == circularQueue.length && size < circularQueue.length) {
                front = 0;
            }
            if (rear == circularQueue.length && size < circularQueue.length) {
                rear = 0;
            }
        } else if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(circularQueue[front].getName() + " has not appeared in all backlogs.");
        }
    }

    private boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }
}
