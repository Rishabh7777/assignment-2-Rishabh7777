package problem2.mybst;

import problem1.node.TreeNode;

public class MyBinarySearchTree extends problem1.mybst.MyBinarySearchTree {

    // it prints left child then right child and then root node
    TreeNode parent;

    // it prints root node then left child and then right child
    public void preOrderTraversal(TreeNode node) {

        // checking if first given node is non-empty
        if (node != null) {
            System.out.print(node.getData());

            if (node.getLeft() != null) {
                System.out.print(", ");
                preOrderTraversal(node.getLeft());  // calling method again for left child of node
            }

            if (node.getRight() != null) {
                System.out.print(", ");
                preOrderTraversal(node.getRight()); // calling method again for right child of node
            }
        }
    }

    public void postOrderTraversal(TreeNode node) {

        // checking if first given node is non-empty
        if (node != null) {

            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());

            System.out.print(node.getData() + " ");
        }
    }

}
