package com.rzh.HJ;

import java.util.Scanner;

/**
 * @ClassName Real1
 * @Author yuanFeng
 * @Date 2023/3/8 16:23
 * 模拟商场优惠打折
 */
public class Real1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int num1 = Integer.parseInt(s1[0]);
        int num2 = Integer.parseInt(s1[1]);
        int num3 = Integer.parseInt(s1[2]);//num1,2,3分别代表三种优惠券的数量
        int num4 = Integer.parseInt(scanner.nextLine());//有几个人
        double[] nums = new double[num4];//每个人的初始价格
        for (int i = 0; i < num4; i++) {
            nums[i] = Double.parseDouble(scanner.nextLine());
        }
        for (int i = 0; i < num4; i++) {//遍历每个价格
            double temp1 = nums[i];//初始价格
            double temp2 = Math.ceil(temp1 * 0.92);//使用优惠券2后的价格
            double temp3 = 5 * num3;//优惠券3可以减免的价格
            if (num1 == 0 && num2 == 0) {//当优惠券1和优惠券2都为0
                int res = (int) (temp1 - temp3);
                System.out.println(res + " " + num3);
            } else if (num1 == 0 || temp1 < 100) {//当优惠券1为0
                int res = (int) (temp2 - temp3);
                int num = num3 + 1;
                System.out.println(res + " " + num);
            } else if (num2 == 0) {//当优惠券2为0
                int num = num4;
                double temp = nums[i];//当前价格
                for (int j = 0; j < num1; j++) {
                    if (num >= 100) {
                        int temp4 = (int) (Math.floor(temp / 100) * 10);
                        temp -= temp4;
                        num++;
                    } else {
                        break;
                    }
                }
                int res = (int) (temp - temp3);
                System.out.println(res + " " + num);
            } else {//1、2优惠券都有
                double temp = nums[i];
                int num = 0;
                int numOne = 0;
                double res = 0;
                double res1 = temp;
                double res2 = Math.floor(temp * 0.92);
                for (int j = 0; j < num1; j++) {
                    double temp4 = Math.floor(temp / 100) * 10;
                    res1 -= temp4;
                    numOne++;
                }
                if (res1 < res2){
                    res = res1;
                    num = numOne;
                    double res1_1 = Math.floor(res * 0.92);
                    double res1_2 = res - temp3;
                }else {
                    res = res2;
                    num++;
                }
//                double temp = nums[i];
//                int num = 0;
//                for (int j = 0; j < num1; j++) {
//                    int temp4 = (int) (Math.floor(temp / 100) * 10);
//                    temp -= temp4;
//                    num++;
//                }
//                if (Math.ceil(temp * 0.08) > temp3){
//                    temp -= Math.ceil(temp * 0.08);
//                    num++;
//                }else {
//                    temp -= temp3;
//                    num += num3;
//                }
//                int res = (int) temp;
//                System.out.println(res + " " + num);
            }
        }
    }

}
