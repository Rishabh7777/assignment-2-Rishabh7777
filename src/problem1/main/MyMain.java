/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree tree = new MyBinarySearchTree();

        System.out.println(tree.getRootNode());
        tree.insert(70);
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
        tree.insert(111);
        System.out.println(tree.getRootNode());
    }
}
