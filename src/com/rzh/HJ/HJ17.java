package com.rzh.HJ;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @ClassName HJ17
 * @Author yuanFeng
 * @Date 2023/3/14 22:23
 */
public class HJ17 {
    public static void main(String[] args) {
        int up = 0, left = 0;
        Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()){
                String s = scanner.nextLine();
                String[] split = s.split(";");
                for (int i = 0; i < split.length; i++) {
                    if (split[i].length() <= 1){
                        continue;
                    }
                    String s1 = split[i].substring(0, 1);
                    String s2 = split[i].substring(1);
                    if (isWSAD(s1)){
                        if (!isNum(s2)){
                            continue;
                        }
                        int num = Integer.parseInt(s2);
                        if (s1.equals("A")){
                            left -= num;
                        }else if (s1.equals("D")){
                            left += num;
                        }else if (s1.equals("W")){
                            up += num;
                        }else {
                            up -= num;
                        }
                    }
                }
            }
        System.out.println(up + " " + left);
        }
    public static boolean isWSAD(String s){
        HashSet<String> set = new HashSet<>();
        set.add("W");
        set.add("S");
        set.add("A");
        set.add("D");
        if (set.contains(s)){
            return true;
        }
        return false;
    }
    public static boolean isNum(String s){
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar > '9' || aChar < '0'){
                return false;
            }
        }
        return true;
    }
}
