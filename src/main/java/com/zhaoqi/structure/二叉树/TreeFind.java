package com.zhaoqi.structure.二叉树;

import com.zhaoqi.structure.二叉树.init.Tree;
import com.zhaoqi.structure.二叉树.init.TreeInit;

/**
 * @author zhaoqi
 * @since 2020-03-11
 */
public class TreeFind {

    static Tree<Integer> tree = TreeInit.getTree();

    public static void 递归查询(Integer target) {

        Tree.TreeNode<Integer> node = findDeep(tree.getTop(), target);

        System.out.println(node);
    }

    public static Tree.TreeNode findDeep(Tree.TreeNode<Integer> tempNode, Integer target) {
        if (tempNode == null) {
            return null;
        }
        if (target.equals(tempNode.getVal())) {
            return tempNode;
        }
        if (target < tempNode.getVal()) {
            findDeep(tempNode.getLeft(), target);
        } else {
            findDeep(tempNode.getRight(), target);

        }
        return null;
    }

    //===========================================================================================

    public static Tree.TreeNode<Integer> 非递归查询(Integer target) {

        Tree.TreeNode<Integer> tempNode = null;

        tempNode = tree.getTop();
        deep:
        while (true) {
            if (tempNode == null) {
                break deep;
            }
            if (target.equals(tempNode.getVal())) {
                return tempNode;
            }

            if (target < tempNode.getVal()) {
                tempNode = tempNode.getLeft();
            } else {
                tempNode = tempNode.getRight();
            }

        }
        return null;
    }

}
