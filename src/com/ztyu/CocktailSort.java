package com.ztyu;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ztyu
 * on 2017/5/2.
 *
 * 鸡尾酒排序(定向冒泡排序、鸡尾酒搅拌排序、搅拌排序、涟漪排序、来回排序、快乐小时排序)
 * 时间复杂度：O(N^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class CocktailSort {

    /**
     * 鸡尾酒排序等于是冒泡排序的轻微变形，不同的地方在于从低到高然后从高到低
     * 它可以得到比冒泡排序稍微好一点的性能
     * @param numList
     * @return
     */
    public static List<Integer> sortFun(List<Integer> numList){
        int i, left = 0, right = numList.size()-1;
        Integer temp;
        while (left < right){
            for (i = left; i < right; i++){
                if(numList.get(i) > numList.get(i+1)){
                    temp = numList.get(i);
                    numList.set(i, numList.get(i+1));
                    numList.set(i+1, temp);
                }
            }
            right--;

            for (i = right; i > left; i--){
                if(numList.get(i-1) > numList.get(i)){
                    temp = numList.get(i-1);
                    numList.set(i-1, numList.get(i));
                    numList.set(i, temp);
                }
            }
            left++;
        }
        return numList;
    }

    public static void main(String[] args){
        Integer arr[] = {5,3,1,2,4};
        List<Integer> numbs = sortFun(Arrays.asList(arr));
        numbs.forEach(System.out::println);
    }
}
