package com.ztyu.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ztyu
 * on 2017/5/2.
 * 生成随机数12
 */
public class GenerateNum {

    public static List<Integer> numbers(int length){
        List<Integer> numList = new ArrayList<>(length);
        Random rd = new Random();
        for (int i=0; i<length; i++){
            numList.add(rd.nextInt());
        }
        return numList;
    }

}
