package com.rzh.HJ;

import java.util.Scanner;

/**
 * @ClassName HJ2
 * @Author yuanFeng
 * @Date 2023/2/20 11:05
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        if (s2 == null || "".equals(s2)){
            System.out.println(0);
            return;
        }
        int sum = 0;
        Integer ASCII = Integer.valueOf(s2.toCharArray()[0]);
        char[] chars = s1.toCharArray();
        if (ASCII >= 97 && ASCII <= 122){
            for (int i = 0; i < chars.length; i++) {
                Integer temp = Integer.valueOf(chars[i]);
                if (temp == ASCII || temp + 32 == ASCII){
                    sum++;
                }
            }
        }else if (ASCII >= 65 && ASCII <= 90){
            for (int i = 0; i < chars.length; i++) {
                Integer temp = Integer.valueOf(chars[i]);
                if(temp == ASCII || temp - 32 == ASCII){
                    sum++;
                }
            }
        }else {
            for (int i = 0; i < chars.length; i++) {
                Integer temp = Integer.valueOf(chars[i]);
                if(temp == ASCII){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
