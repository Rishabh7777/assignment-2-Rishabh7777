/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    private TreeNode rootNode;

    public int getRootNode() {
        if (rootNode == null) {
            return -1;
        }
        return rootNode.getData();
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

    public void printTreeInOrder(TreeNode node) {
        if (node != null) {
            printTreeInOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            printTreeInOrder(node.getRight());
        }
    }
}
