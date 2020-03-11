package com.zhaoqi.structure.二叉树;

import com.zhaoqi.structure.二叉树.init.Tree;
import com.zhaoqi.structure.二叉树.init.TreeInit;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author zhaoqi
 * @since 2020-03-11
 */
public class TreeForeach {

    static Tree<Integer> tree = TreeInit.getTree();

    static List<Tree.TreeNode<Integer>> foreachNodes = new LinkedList<>();


    //
    public static List<Tree.TreeNode<Integer>> 深度遍历_递归先序遍历() {

        findDeepL(tree.getTop());
        return foreachNodes;
    }
    public static void findDeepL(Tree.TreeNode<Integer> tempNode) {
        if (tempNode == null) {
            return;
        }
        foreachNodes.add(tempNode);
        findDeepL(tempNode.getLeft());
        findDeepL(tempNode.getRight());

    }

    //
    public static List<Tree.TreeNode<Integer>> 深度遍历_递归中序遍历() {

        findDeepM(tree.getTop());
        return foreachNodes;
    }
    public static void findDeepM(Tree.TreeNode<Integer> tempNode) {
        if (tempNode == null) {
            return;
        }
        findDeepL(tempNode.getLeft());
        foreachNodes.add(tempNode);
        findDeepL(tempNode.getRight());

    }

    //
    public static List<Tree.TreeNode<Integer>> 深度遍历_递归后序遍历() {
        findDeepR(tree.getTop());
        return foreachNodes;

    }
    public static void findDeepR(Tree.TreeNode<Integer> tempNode) {
        if (tempNode == null) {
            return;
        }
        findDeepL(tempNode.getLeft());
        findDeepL(tempNode.getRight());
        foreachNodes.add(tempNode);


    }




    //如果是用栈遍历  先从左节点开始 直接到底
    // 然后忘外吐一个节点 看下是否有右节点 如果是有右节点 再以这个右节点为基础 直接到底
    //到底以后再往外吐
    public static List<Tree.TreeNode<Integer>> 深度遍历_非递归左序遍历() {

        Stack<Tree.TreeNode<Integer>> stack= new Stack<>();

        Tree.TreeNode<Integer> root = tree.getTop();

        stack.push(root);
        while(root!=null){
            while (root.getLeft() != null) {
                stack.push(root.getLeft());
                root = root.getLeft();
            }


            if(!stack.isEmpty()){
                Tree.TreeNode<Integer> pop = stack.pop();
                root=pop.getRight();
            }
        }

        return null;
    }

    //
    public static List<Tree.TreeNode<Integer>> 层级遍历() {

        return null;
    }

}
