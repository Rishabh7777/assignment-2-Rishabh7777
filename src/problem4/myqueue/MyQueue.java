/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.node.Node;

public class MyQueue extends MyBinarySearchTree {

    private Node front;
    private Node rear;  // point to the last element of queue
    private int size;

    // constructor
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // due to no limitation of size, element will always be added
    public void insertInQueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {    // means no array exists till now
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = rear.getNext();
        }
        size++;
    }

    public void preOrderTraversal(TreeNode node) {

        // checking if first given node is non-empty
        if (node != null) {

            insertInQueue(node.getData());

            preOrderTraversal(node.getLeft());  // calling method again for left child of node
            preOrderTraversal(node.getRight()); // calling method again for right child of node
        }
    }

    public void printQueue() {
        if (front == null) {
            System.out.println("No queue to print.");
        } else {
            System.out.print("Printing Queue: ");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.getData());
                temp = temp.getNext();
                if (temp != null) {
                    System.out.print("----->");
                }
            }
            System.out.println();
        }
    }
}
