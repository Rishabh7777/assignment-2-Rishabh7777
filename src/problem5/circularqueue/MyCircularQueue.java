/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

//to implement circular queue
public class MyCircularQueue {

    private int[] circularQueue;
    private int front;
    private int rear;
    private int size;

    public MyCircularQueue(int sizeOfArray) {
        circularQueue = new int[sizeOfArray];
        front = 0;
        rear = 0;
        size = 0;
    }
}
