package com.rzh.JZoffer;
import java.util.*;
/**
 * @ClassName solution15
 * @Author yuanFeng
 * @Date 2022/11/17 21:29
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class solution15 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = len; i > 0; i--) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res.add(temp);
        }
        return res;
    }
//    List<List<Integer>> res = new ArrayList<>();
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        LvFun(root);
//        return res;
//    }
//    public void LvFun(TreeNode node){
//        if (node == null) return;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(node);
//        while (!queue.isEmpty()){
//            List<Integer> list = new ArrayList<>();
//            int len = queue.size();
//            while (len > 0){
//                TreeNode tempNode = queue.poll();
//                list.add(tempNode.val);
//                if (tempNode.left != null) queue.offer(tempNode.left);
//                if (tempNode.right != null) queue.offer(tempNode.right);
//                len--;
//            }
//            res.add(list);
//        }
//    }
}
