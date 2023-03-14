package com.rzh.HJ;

import java.util.Scanner;

/**
 * @ClassName HJ5
 * @Author yuanFeng
 * @Date 2023/2/20 23:12
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String num_16 = line.substring(2, line.length());
        int res = 0;
        for (int i = 0; i < num_16.length(); i++) {
            if (num_16.charAt(i) >= 'A' && num_16.charAt(i) <= 'F'){
                res = res * 16 + (num_16.charAt(i) - 'A' + 10);
            }else if (num_16.charAt(i) >= 'a' && num_16.charAt(i) <= 'f'){
                res = res * 16 + (num_16.charAt(i) - 'a' + 10);
            }else {
                res = res * 16 + (num_16.charAt(i) - '0');
            }
        }
        System.out.println(res);
    }
}
