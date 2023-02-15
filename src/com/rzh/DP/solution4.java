package com.rzh.DP;

/**
 * @ClassName solution4
 * @Author yuanFeng
 * @Date 2023/2/4 15:35
 * 63. 不同路径 II
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * 示例 1：
 * 输入：obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * 输出：2
 * 解释：3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 * 示例 2：
 * 输入：obstacleGrid = [[0,1],[0,0]]
 * 输出：1
 * 提示：
 * m == obstacleGrid.length
 * n == obstacleGrid[i].length
 * 1 <= m, n <= 100
 * obstacleGrid[i][j] 为 0 或 1
 */
public class solution4 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid[0].length;//横
        int n = obstacleGrid.length;//纵
        int[][] dp = new int[m][n];
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1){//如果障碍物位于起点或者终点位置，那么直接返回0就ok
            return 0;
        }else {//否则起点位置为1
            dp[0][0] = 1;
        }
        for (int i = 0; i < m; i++) {//遍历第一行，如果障碍物位于第一行，那么其之后的所有位置都是0
            if (obstacleGrid[0][i] == 1){
                dp[0][i] = 0;
                break;
            }
            dp[0][i] = 1;
        }
        for (int i = 0; i < n; i++) {//遍历第一列，如果障碍物位于第一列，那么其之后的所有位置都是0
            if (obstacleGrid[i][0] == 1){
                dp[i][0] = 0;
                break;
            }
            dp[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {//遍历整个数组，如果有障碍物，那么障碍物的点的值为0，否则为左边和上边的值的和
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}