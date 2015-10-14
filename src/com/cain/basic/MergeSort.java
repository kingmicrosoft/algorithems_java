package com.cain.basic;

/**
 * Created by wisdom on 15-9-28.
 */
public class MergeSort {

    public  static void mergeSort(int[] data){

        sort(data, 0, data.length-1);

    }

    private static void sort(int[] data, int left, int right) {

        if (left>=right)
            return;

        int middle=(left+right)/2;

        sort(data, left, middle);
        sort(data, middle + 1, right);

        merge(data, left, middle, right);
    }

    private static void merge(int[] data, int left, int middle, int right) {



    }

}
