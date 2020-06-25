package ru.pamishenko.homework1;

import java.util.ArrayList;

public class Solution1 {


    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g"};
        swapMy(arr , 2, 5);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    public static <T> T[] swapMy(T[] arr, int i, int j){
        T temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
