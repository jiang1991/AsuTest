package com.example.asutest.one;

import java.util.Arrays;

/**
 * Assignment 1
 * 下载或编写代码以实现二进制搜索算法。利用所选的单元测试框架测试你的代码。提交要测试的代码副本、生成的测试用例以及输出报告（使用工具截取屏幕截图）。
 *
 * @author jiang
 */
public class Oct {

    /**
     * Perform a binary Search in Sorted Array in Java
     *
     * @param input
     * @param number
     * @return true if element in array
     */
    public static boolean binarySearch(int[] input, int number) {

        // useless var
//        String s = "i am useless string";

        // assign a var but never call it
//        int i = 10;
//        i++;

        Arrays.sort(input);

        int first = 0;
        int last = input.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (input[middle] < number) {
                first = middle + 1;
            } else if (input[middle] == number) {
                return true;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return false;
    }

}
