package com.zhaoqi.structure.二叉树.init;

import com.zhaoqi.structure.二叉树.init.Tree;
import lombok.Getter;

/**
 * @author zhaoqi
 * @since 2020-03-10
 * 100
 * 50   150
 * 25 75 125 175
 * 查找 新增  遍历
 */
public class TreeInit {

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

    public static Tree<Integer> getTree() {
        return tree;
    }

}
