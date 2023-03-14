package com.rzh.HJ;

import java.util.Scanner;

/**
 * @ClassName HJ13
 * @Author yuanFeng
 * @Date 2023/3/10 11:34
 */
public class HJ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (i == split.length - 1){
                System.out.println(split[0]);
            }else {
                System.out.print(split[split.length - i - 1] + " ");
            }
        }
    }
}
