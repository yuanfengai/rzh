package com.rzh.HJ;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName real2
 * @Author yuanFeng
 * @Date 2023/3/9 10:35
 * 核酸检测人员安排
 * 在系统，网络均正常的情况下组织核酸采样员和志愿者对人群进行核酸检测筛查。
 * 每名采样员的效率不同，采样效率为N人/小时，由于外界变化，采样员的效率会以M人/小时为粒度发生变化，
 * M为采样效率浮动粒度，M=N*10%，输入保证N*10%的结果为整数，采样员效率浮动规则：
 * 采样员需要一名志愿者协助组织才能发挥正常效率，在此基础上，每增加一名志愿者，效率提升1M，最多提升3M，
 * 如果没有志愿者协助组织，效率下降2M。怎么安排速度最快？求总最快检测效率（总检查效率为各采样人员效率值相加）
 * 输入描述：第一行：每一个值，采样员数，取值范围[1,100]，第二个值，志愿人数，取值范围[1，500]；
 * 第二行：各采样员基准效率值（单位人/小时），取值范围[60，600]，保证序列中每项值计算10%为整数。
 * 输出描述：第一行：总最快检测效率（单位人/小时）
 * 示例：输入：
 * 2  2
 * 200  200
 * 输出
 * 400
 */
public class real2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine1 = scanner.nextLine();
        String[] split1 = nextLine1.split(" ");
        String nextLine2 = scanner.nextLine();
        String[] split2 = nextLine2.split(" ");
        int num1 = Integer.parseInt(split1[0]);
        int num2 = Integer.parseInt(split1[1]);
        int[] nums = new int[num1];
        int[] dp = new int[num2];
        int res = 0;
        for (int i = 0; i < num1; i++) {
            nums[i] = Integer.parseInt(split2[i]) / 10;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num2; i++) {
            int temp = 0;
            int temp1 = 0;
            for (int j = 0; j < num1; j++) {
                if (!map.containsKey(j)){
                    temp = nums[j] * 2;
                }else if(map.get(j) <= 4){
                    temp = nums[j];
                }else {
                    break;
                }
                if (dp[i] < temp){
                    dp[i] = temp;
                    temp1 = j;
                }
            }
            if(map.containsKey(temp1)){
                map.put(temp1, map.get(temp1) + 1);
            }{
                map.put(temp1, 1);
            }
        }
        for (int i = 0; i < num1; i++) {
            res = res + nums[i] * 8;
        }
        for (int i = 0; i < num2; i++) {
            res += dp[i];
        }
        System.out.println(res);
    }
}
