package com.cain.basic;

import java.util.Comparator;

/**
 * Created by wisdom on 15-9-29.
 */
public class HeapSort {


    public static void sort(Comparable[] data){
buildMaxHeap(data);

        for(int i=data.length;i>1;i--){


            Comparable temp=data[0];
            data[0]=data[i-1];
            data[i-1]=temp;

            maxHeapify(data,1,i-1);
        }

    }

    private static void maxHeapify(Comparable[] data, int i, int i1) {




    }

    private static void buildMaxHeap(Comparable[] data) {




    }

}
