package com.rzh.back;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName solution2
 * @Author yuanFeng
 * @Date 2023/2/15 16:09
 */
public class solution2 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int sum = 0;
        return res;
    }
    private void combinationHelper(int k, int n, int sum){
        if (sum == n){
            res.add(new ArrayList<>(path));
            return;
        }else if (sum > n){
            return;
        }
        for (int i = 0; i < k - path.size(); i++) {
            for (int j = 0; j < 9; j++) {

            }
        }

    }
}
