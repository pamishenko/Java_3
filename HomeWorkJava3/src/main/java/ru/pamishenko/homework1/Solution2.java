package ru.pamishenko.homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        Integer[] testArr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList list = arrayToList(testArr);
        System.out.println(list.toString());
    }


    public static <T> ArrayList<T>  arrayToList(T[] arr){
        ArrayList<T> arrayList = new ArrayList<T>();

        for (int i = 0; i < arr.length; i ++){
            arrayList.add(arr[i]);
        }

        return arrayList;
    }
}
