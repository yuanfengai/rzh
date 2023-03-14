package com.rzh.HJ;

import java.util.Scanner;
import java.util.HashMap;

/**
 * @ClassName HJ6
 * @Author yuanFeng
 * @Date 2023/3/6 23:32
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = Integer.parseInt(s);
        test(num);

    }
    public static void test(int num){
        for (int i = 2; i <= num; i++) {
            if (num % i == 0){
                System.out.print(i + " ");
                num = num / i;
                test(num);
                break;
            }else if (i > num / i){
                i = num;
                System.out.print(i + " ");
            }
        }
    }
}
