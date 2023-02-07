package com.rzh.JZoffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName solution8
 * @Author yuanFeng
 * @Date 2022/10/13 23:16
 * 二叉树的前中后序遍历
 */
public class solution8 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            res.add(temp.val);
            if (temp.right != null){
                stack.add(temp.right);
            }
            if (temp.left != null){
                stack.add(temp.left);
            }
        }
        return res;
    }
    public void preorder(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}
