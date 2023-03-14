package com.rzh.HJ;

/**
 * @ClassName real3
 * @Author yuanFeng
 * @Date 2023/3/14 15:42
 * 给定两个字符串，string1和string2，string1是一个被加干扰的字符串，string1由小写英文字母（a-z），和数字字符（0-9）组成，而加干扰字符串由0-9，a-f组成，string1里面可能包含0个或多个加扰子串，剩下可能有0个或多个有效子串，这些有效子串被加扰子串隔开。string2是一个参考字符串，仅由小写英文字母a-z组成。
 * 你需要在string1里面找到一个有效子串，这个有效子串要同时满足下面两个条件：
 * （1）这个有效子串里不同字母的数量不超过且最接近于string2里不同字母的数量，即小于或等于string2里不同字母的数量的同时且最大
 * （2）这个有效子串是满足条件（1）里所有子串（如果有多个的话）里字典序最大的一个。如果没有找到合适条件的子串的话，请输出Not Found
 * 示例：输入字符串string1为thisisanewday111forme，输入字符串string2为Good，string1有效子串和加扰子串分割后表示为：thisis+a+n+e+w+da+y+111f+orm+e，去除加扰子串（a,e,da,111,f,e）后有效子串表示为（thisis,n,w,y,orm）输入字符串string2里不同字母的数量为3（g,o,d）从有效子串候选中找出orm满足要求，其不同字母的数量为3，最接近于string2中不同字母的数量。
 * 输入：string1和string2
 * 123admyffc79pt
 * ssyy
 * 输出：
 * pt
 */
public class real3 {
    public static void main(String[] args) {

    }
}
