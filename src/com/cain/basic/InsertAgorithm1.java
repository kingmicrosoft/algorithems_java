package com.cain.basic;

/**
 * Created by wisdom on 15-9-27.
 */
public class InsertAgorithm1 {


    public static void main(String[] args) {

        int a[] = {1, 2, 5, 3, 11, 7, 8};
        int i, j, k;
        int lenght = a.length;
        for (i = 1; i < lenght; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (a[j] < a[i])
                    break;

            }
            if (j != i - 1) {
                int temp = a[i];
                for (k = i - 1; k > j; k--) {
                    a[k + 1] = a[k];
                }

                a[k + 1] = temp;

            }
        }


        for (int m = 0; m < a.length; m++) {
            System.out.print(a[m] + ";");
        }
    }
}
