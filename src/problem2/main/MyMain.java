/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem2.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree tree = new MyBinarySearchTree();
        /*tree.insert(70);
        tree.insert(35);
        tree.insert(93);
        tree.insert(19);
        tree.insert(60);
        tree.insert(79);
        tree.insert(108);
        tree.insert(11);
        tree.insert(28);
        tree.insert(64);
        tree.insert(99);
        tree.insert(111);*/

        tree.insert(25);
        tree.insert(15);
        tree.insert(50);
        tree.insert(10);
        tree.insert(22);
        tree.insert(35);
        tree.insert(70);
        tree.insert(4);
        tree.insert(12);
        tree.insert(18);
        tree.insert(24);
        tree.insert(31);
        tree.insert(44);
        tree.insert(66);
        tree.insert(90);

        tree.preOrderTraversal(tree.getRootNode());
    }
}
