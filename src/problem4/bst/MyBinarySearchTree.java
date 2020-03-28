package problem4.bst;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class MyBinarySearchTree {

    private TreeNode rootNode;

    public TreeNode getRootNode() {
        return rootNode;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (rootNode == null) {
            rootNode = node;
        } else {
            TreeNode temp = rootNode;
            TreeNode parentNode = null;
            while (temp != null) {
                parentNode = temp;
                if (node.getData() < temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            // setting child node
            if (node.getData() < parentNode.getData()) {
                parentNode.setLeft(node);
            } else {
                parentNode.setRight(node);
            }
        }
    }

    MyQueue myQueue = new MyQueue();

    public void preOrderTraversalWithQueue(TreeNode node) {

        // checking if first given node is non-empty
        if (node != null) {

            myQueue.insertInQueue(node.getData());

            preOrderTraversalWithQueue(node.getLeft());  // calling method again for left child of node
            preOrderTraversalWithQueue(node.getRight()); // calling method again for right child of node
        }
    }
}
