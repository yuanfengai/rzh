package com.rzh.JZoffer;

/**
 * @ClassName solution3
 * @Author yuanFeng
 * @Date 2022/10/10 22:01
 * 剑指 Offer 20. 表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 *
 * 数值（按顺序）可以分成以下几个部分：
 *
 * 若干空格
 * 一个 小数 或者 整数
 * （可选）一个 'e' 或 'E' ，后面跟着一个 整数
 * 若干空格
 * 小数（按顺序）可以分成以下几个部分：
 *
 * （可选）一个符号字符（'+' 或 '-'）
 * 下述格式之一：
 * 至少一位数字，后面跟着一个点 '.'
 * 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
 * 一个点 '.' ，后面跟着至少一位数字
 * 整数（按顺序）可以分成以下几个部分：
 *
 * （可选）一个符号字符（'+' 或 '-'）
 * 至少一位数字
 * 部分数值列举如下：
 * ["+100", "5e2", "-123", "3.1416", "-1E-16", "0123"]
 * 部分非数值列举如下：
 * ["12e", "1a3.14", "1.2.3", "+-5", "12e+5.4"]
 * 示例 1：
 * 输入：s = "0"
 * 输出：true
 * 示例 2：
 * 输入：s = "e"
 * 输出：false
 * 示例 3：
 * 输入：s = "."
 * 输出：false
 * 示例 4：
 * 输入：s = "    .1  "
 * 输出：true
 * 提示：
 * 1 <= s.length <= 20
 * s 仅含英文字母（大写和小写），数字（0-9），加号 '+' ，减号 '-' ，空格 ' ' 或者点 '.' 。
 */
public class solution3 {
    public boolean isNumber(String s) {
        return ForBoolean(s);
    }

    private boolean ForBoolean(String s) {
        //如果长度等于0那么返回false
        if (s == null || s.length() == 0){
            return false;
        }
        //定义是否出现数字 , Ee, .
        boolean isNum = false, isEe = false , isDot = false;
        char[] str = s.trim().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= '0' || str[i] < '9'){
                isNum = true;
            }else if (str[i] == 'e' || str[i] == 'E'){
                if (!isNum || isEe){
                    return false;
                }
                isNum = false;
                isEe = true;
            }else if (str[i] == '.'){
                if (isEe || isDot){
                    return false;
                }
                isDot = true;
            }else if (str[i] == '+' || str[i] == '-'){
                if(i!=0 && str[i-1] != 'e' && str[i-1] != 'E'){
                    return false;
                }
            }else {
                return false;
            }
        }
        return isNum;
    }
}
