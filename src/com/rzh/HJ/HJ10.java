package com.rzh.HJ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName HJ10
 * @Author yuanFeng
 * @Date 2023/3/9 22:57
 */
public class HJ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : chars) {
            set.add(c);
        }
        System.out.println(set.size());
    }
}
