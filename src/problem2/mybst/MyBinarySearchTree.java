package problem2.mybst;

import problem1.node.TreeNode;

public class MyBinarySearchTree extends problem1.mybst.MyBinarySearchTree {

    // it prints root node then left child and then right child
    public void preOrderTraversal(TreeNode node) {

        // checking if given node is non-empty
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

}
