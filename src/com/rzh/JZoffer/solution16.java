package com.rzh.JZoffer;
import java.util.*;
/**
 * @ClassName solution16
 * @Author yuanFeng
 * @Date 2022/11/17 22:40
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
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
 *   [20,9],
 *   [15,7]
 * ]
 */
public class solution16 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int deep = 0;
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = len; i > 0; i--) {
                TreeNode node = queue.poll();
                if (deep % 2 != 0){
                    temp.addLast(node.val);
                }else {
                    temp.add(node.val);
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res.add(temp);
            deep++;
        }
        return res;
    }
}
