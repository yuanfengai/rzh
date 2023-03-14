package com.rzh.HJ;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @ClassName HJ8
 * @Author yuanFeng
 * @Date 2023/3/7 16:06
 */
public class HJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < num; i++) {
            String line = scanner.nextLine();
            String[] s = line.split(" ");
            int key = Integer.parseInt(s[0]);
            int value = Integer.parseInt(s[1]);
            if (map.containsKey(key)){
                int newValue = map.get(key) + value;
                map.put(key, newValue);
            }else {
                map.put(key, value);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+ " " + entry.getValue());
            System.out.println();
        }

    }
}
