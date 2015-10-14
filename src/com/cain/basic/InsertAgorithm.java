package com.cain.basic;

import java.lang.reflect.Array;

/**
 * Created by wisdom on 15-9-27.
 */
public class InsertAgorithm {
/*

现在进行一下改写，将搜索和数据后移这二个步骤合并。即每次a[i]先和前面一个数据a[i-1]比较，如果a[i] > a[i-1]说明a[0…i]也是有序的，无须调整。
否则就令j=i-1,temp=a[i]。
然后一边将数据a[j]向后移动一边向前搜索，当有数据a[j]<a[i]时停止并将temp放到a[j + 1]处。

 */
    private  static void insertPaixu(int a[],int n){
        int i,j;
        for (i=1;i<n;i++){
            if(a[i]<a[i-1]) {
                int temp = a[i];
                for (j =i - 1; j >= 0 && a[j] > temp; j--) {
                    a[j+1]=a[j];

                a[j+1]=temp;
                }
            }


        }

        for (int m = 0; m < a.length; m++) {
            System.out.print(a[m] + ";");
        }

    }

    public static void main(String[] args) {
        int a[]={1,4,302,102,101};
        insertPaixu(a,5);

    }
}
