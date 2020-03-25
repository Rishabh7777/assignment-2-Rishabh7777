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

    // will print all element in increasing order
    public void printTreeInOrder(TreeNode node) {
        if (node != null) {
            printTreeInOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            printTreeInOrder(node.getRight());
        }
    }

    public void printTree(TreeNode node) {
        System.out.print("Printing tree: ");
        printTreeInOrder(node);
    }

    int count = 0;  // will count nodes with no left child

    public void printLeftChildrenInOrder(TreeNode node) {
        if (node != null) {
            if (node.getLeft() != null) {
                printLeftChildrenInOrder(node.getLeft());
            } else {
                count++;
            }
            if (node != rootNode) {
                System.out.print(node.getData() + " ");
            }
            if (node.getRight() != null) {
                printLeftChildrenInOrder(node.getRight().getLeft());
                if (node.getRight().getRight() != null) {
                    printLeftChildrenInOrder(node.getRight().getRight().getLeft());
                }
            }
        }
//        System.out.println(count);
    }

    public void printLeftChildAndCount(TreeNode node) {
        System.out.print("Printing left children: ");
        printLeftChildrenInOrder(node);
        System.out.println();
        System.out.println("Total nodes with no left child: " + count);
    }
}
