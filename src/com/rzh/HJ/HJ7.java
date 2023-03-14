package com.rzh.HJ;

import java.util.Scanner;

/**
 * @ClassName HJ7
 * @Author yuanFeng
 * @Date 2023/3/7 15:43
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("\\.");
        String s1 = split[0];
        String s2 = split[1];
        int i = Integer.parseInt(s1);
        char c = s2.charAt(0);
        if (i >= 0){
            if (c >= '0' && c <= '4'){
                System.out.println(i);
            }else {
                System.out.println(i + 1);
            }
        }else {
            if (c >= '0' && c <= '4'){
                System.out.println(i);
            }else {
                System.out.println(i - 1);
            }
        }
    }
}
