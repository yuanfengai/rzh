package com.rzh.JZoffer;

/**
 * @ClassName TreeNode
 * @Author yuanFeng
 * @Date 2022/10/13 22:34
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
