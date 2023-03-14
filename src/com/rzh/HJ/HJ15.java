package com.rzh.HJ;

import java.util.Scanner;

/**
 * @ClassName HJ15
 * @Author yuanFeng
 * @Date 2023/3/10 14:53
 */
public class HJ15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = Integer.toBinaryString(num);
        int end = s.replaceAll("0", "").length();
        System.out.println(end);
    }
}
