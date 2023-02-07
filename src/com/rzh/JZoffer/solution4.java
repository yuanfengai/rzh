package com.rzh.JZoffer;

/**
 * @ClassName solution4
 * @Author yuanFeng
 * @Date 2022/10/11 21:35
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 * 示例：
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 * 提示：
 * 0 <= nums.length <= 50000
 * 0 <= nums[i] <= 10000
 */
public class solution4 {
    public int[] exchange(int[] nums) {
        //双指针
        int len = nums.length;
        int temp = 0;
        int left = 0, right = len - 1;
        while (left < right){
            while (left < right && (nums[left] & 1) == 1) left++;
            while (left < right && (nums[right] & 1) == 0) right--;
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
