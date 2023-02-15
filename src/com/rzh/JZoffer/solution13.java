package com.rzh.JZoffer;


/**
 * @ClassName solution13
 * @Author yuanFeng
 * @Date 2022/11/16 22:33
 * 剑指 Offer 29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class solution13 {
    //试试边界法
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        int temp = 0;
        int[] res = new int[(right + 1) * (down + 1)];
        while(true){
            //从左往右
            for (int i = left; i <= right; i++) {
                res[temp++] = matrix[up][i];
            }
            //up++
            if (++up > down){
                break;
            }
            //从上往下
            for (int i = up; i <= down; i++) {
                res[temp++] = matrix[i][right];
            }
            //right--
            if (--right < left){
                break;
            }
            //从右往左
            for (int i = right; i >= left ; i--) {
                res[temp++] = matrix[down][i];
            }
            //down--
            if (--down < up){
                break;
            }
            //从下往上
            for (int i = down; i >= up; i--) {
                res[temp++] = matrix[i][left];
            }
            //left++
            if (++left > right){
                break;
            }
        }
        return res;
    }
}
