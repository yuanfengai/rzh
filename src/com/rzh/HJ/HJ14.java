package com.rzh.HJ;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName HJ14
 * @Author yuanFeng
 * @Date 2023/3/10 14:35
 */
public class HJ14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int num = Integer.parseInt(scanner.nextLine());
            String[] res = new String[num];
            for (int i = 0; i < num; i++) {
                res[i] = scanner.nextLine();
            }
            Arrays.sort(res);
            for (String re : res) {
                System.out.println(re);
            }
        }

    }
}
