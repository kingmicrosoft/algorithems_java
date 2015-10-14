package com.cain.basic;

/**
 * Created by wisdom on 15-9-28.
 */
public class ThreeKindOfAgorithm {

    public static void bubbleSort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {

                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = data[j];
                }
            }
        }
    }





}
