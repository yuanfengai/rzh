package com.rzh.exec_1;

import java.util.*;

/**
 * @ClassName myTest
 * @Author yuanFeng
 * @Date 2023/1/30 14:50
 */
public class myTest {
    public static void main(String[] args) {
        List<HashMap<String, Object>> list1 = new ArrayList<>();
        List<HashMap<String, Object>> list2 = new ArrayList<>();
        HashMap<String, Object> temp1 = new HashMap<>();
        HashMap<String, Object> temp2 = new HashMap<>();
        HashMap<String, Object> temp3 = new HashMap<>();
        HashMap<String, Object> temp4 = new HashMap<>();
        HashMap<String, Object> temp5 = new HashMap<>();
        HashMap<String, Object> temp6 = new HashMap<>();
        HashMap<String, Object> temp7 = new HashMap<>();
        HashMap<String, Object> temp8 = new HashMap<>();

        temp1.put("A","a");
        temp2.put("B","b");
        temp3.put("C","c");
        temp4.put("D","d");
        temp5.put("A","a");
        temp6.put("B","b");
        temp7.put("C","d");
        temp8.put("D","e");

        list1.add(temp1);
        list1.add(temp2);
        list1.add(temp3);
        list1.add(temp4);
        list2.add(temp5);
        list2.add(temp6);
        list2.add(temp7);
        list2.add(temp8);

        for (HashMap<String, Object> nC : list1) {
            for (HashMap<String, Object> oC : list2) {

            }
        }
    }
}
