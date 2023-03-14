package com.rzh.HJ;

import java.util.Scanner;

/**
 * @ClassName HJ11
 * @Author yuanFeng
 * @Date 2023/3/9 23:16
 */
public class HJ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder builder = new StringBuilder(s);
        System.out.println(builder.reverse().toString());
    }
}
