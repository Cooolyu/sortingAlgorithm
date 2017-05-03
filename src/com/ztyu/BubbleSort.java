package com.ztyu;

import com.ztyu.utils.GenerateNum;

import java.util.List;

/**
 * ------------------
 * Created by ztyu
 * on 2017/5/2.
 * ------------------
 * 冒泡排序
 * 时间复杂度：O(N^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class BubbleSort {

    /**
     * 重复走访要排序的数列，一次比较两个元素，如果它们顺序错误就把他们交换过来
     * @param numList
     * @return
     */
    private static List<Integer> sortFun(List<Integer> numList){
        int length = numList.size();
        for(int i=0; i<length - 1; i++){
            //一次循环可以将最大的放到最后，因此第二层循环的长度可以去除
            for (int j=0; j<length-i-1; j++){
                if(numList.get(j) > numList.get(j+1)){
                    int temp = numList.get(j);
                    numList.set(j, numList.get(j+1));
                    numList.set(j+1, temp);
                }
            }
        }
        return numList;
    }

    public static void main(String[] args){
        List<Integer> numbs = sortFun(GenerateNum.numbers(100));
        numbs.stream().forEach(System.out::println);
    }


}
