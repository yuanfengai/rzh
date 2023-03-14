package com.rzh.HJ;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @ClassName HJ9
 * @Author yuanFeng
 * @Date 2023/3/7 23:12
 */
public class HJ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = Integer.parseInt(s);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int temp = num % 10;
            num /= 10;
            set.add(temp);
        }
        set.forEach(System.out::print);
        System.out.println(Math.floor(101.0 / 100) * 10);
    }
}
