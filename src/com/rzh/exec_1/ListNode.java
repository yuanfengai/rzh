package com.rzh.exec_1;

/**
 * @ClassName ListNode
 * @Author yuanFeng
 * @Date 2023/1/6 15:12
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
