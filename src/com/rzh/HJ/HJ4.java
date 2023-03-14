package com.rzh.HJ;

import java.util.Scanner;

/**
 * @ClassName HJ4
 * @Author yuanFeng
 * @Date 2023/2/20 22:26
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String temp = new String();
        while (str.length() >= 8){
            temp = str.substring(0, 8);
            System.out.println(temp);
            str = str.replace(temp, "");
        }
        if (str.length() > 0){
            String temp1 = "00000000";
            System.out.println(str + temp1.substring(str.length()));
        }
    }
}
