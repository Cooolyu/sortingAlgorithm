package com.ztyu;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ztyu
 * on 2017/5/2.
 *
 * 插入排序
 * 时间复杂度：O(N^2)
 * 空间复杂度：O(1)
 * 稳定性：
 */
public class InsertionSort {

    /**
     * 通过构建有序列，对于未排序数据，在已排列序列中从后向前扫描，找到相应位置插入
     * @param numList
     * @return
     */
    public static List<Integer> sortFun(List<Integer> numList){
        int length = numList.size();
        for (int i=0; i<length-1; i++){
            for(int j=i+1; j>0; j--){
                //从后往前比较，保证前面的排序是正确的，因此可以用break
                if(numList.get(j-1) <= numList.get(j))
                    break;
                Integer temp = numList.get(j);
                numList.set(j, numList.get(j-1));
                numList.set(j-1, temp);
            }
        }
        return numList;
    }

    public static void main(String[] args){
        Integer arr[] = {5,3,1,2,4};
        List<Integer> numbs = sortFun(Arrays.asList(arr));
        numbs.forEach(System.out::println);

    }
}
