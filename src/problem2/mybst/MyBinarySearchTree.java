package problem2.mybst;

import problem1.node.TreeNode;

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
}
