package com.zhaoqi.structure.二叉树;

import java.util.List;
import java.util.Stack;

/**
 * @author zhaoqi
 * @since 2020-03-10
 *     100
 *   50   150
 * 25 75 125 175
 *
 * 查找 新增  遍历
 *
 * 遍历分【深度优先-遍历】【深度优先-栈】 【层序遍历】
 *
 * 左序遍历
 * 100
 * 50
 * 25
 * 75
 * 150
 * 125
 *
 * 中序遍历
 *
 *
 *
 *
 */
public class 遍历 {

    static Tree<Integer> tree;

    static {
        tree = new Tree<>();
        Tree.TreeNode<Integer> top = new Tree.TreeNode<Integer>(100);
        tree.setTop(top);

        Tree.TreeNode<Integer> secLeftNode = new Tree.TreeNode<Integer>(50);
        Tree.TreeNode<Integer> secRightNode = new Tree.TreeNode<Integer>(150);

        secLeftNode.setLeft(new Tree.TreeNode<>(25));
        secLeftNode.setRight(new Tree.TreeNode<>(75));

        secRightNode.setLeft(new Tree.TreeNode<>(125));
        secRightNode.setRight(new Tree.TreeNode<>(175));

        top.setLeft(secLeftNode);
        top.setRight(secRightNode);
    }

    public static void main(String[] args) {
        //非递归();
        递归();

    }

    public static void 递归() {

        //使用左序遍历

        Tree.TreeNode<Integer> top = tree.getTop();
        递归method1(top);

    }

    public static void 递归method1(Tree.TreeNode<Integer> temp) {
        if (temp == null) {
            return;
        }
        //左序列就是先打印值
//        100
//        50
//        25
//        75
//        150
//        125
//        175
        递归method1(temp.getLeft());
        System.out.println(temp.getVal());
        递归method1(temp.getRight());

    }

    public static void 非递归() {

        //非递归一定会用到栈空间


        //先写使用栈空间的中序遍历
        Stack<Tree.TreeNode> stack  = new Stack<>();
        stack.add(tree.getTop());




    }



}
