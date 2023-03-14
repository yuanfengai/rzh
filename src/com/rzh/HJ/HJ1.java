package com.rzh.HJ;

import java.util.Scanner;

/**
 * @ClassName HJ1
 * @Author yuanFeng
 * @Date 2023/2/20 10:50
 */
public class HJ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        char[] chars = line.toCharArray();
        if (line == null){
            return;
        }
        int len = line.length();
        int slow = 0, fast = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' '){
                slow = i;
            }
            fast++;
        }
        if (slow != 0){
            System.out.println(fast - slow - 1);
        }
    }
}
