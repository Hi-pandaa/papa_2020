package com.zhaoqi.structure.二叉树.init;

import lombok.Data;

/**
 * @author zhaoqi
 * @since 2020-03-10
 */
@Data
public class Tree<T> {
    TreeNode<T> top;

    @Data
    public static class TreeNode<T> {

        private T val;

        private TreeNode<T> left;

        private TreeNode<T> right;

        public TreeNode(T val) {
            this.val = val;
        }

    }
}
