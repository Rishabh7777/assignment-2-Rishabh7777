/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.node.Node;

public class MyQueue {

    private Node front;
    private Node rear;  // point to the last element of queue
    private int size;

    // constructor
    MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }
}
