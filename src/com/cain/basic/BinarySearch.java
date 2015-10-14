package com.cain.basic;

/**
 * Created by wisdom on 15-9-28.
 */
public class BinarySearch {

    public static int searchBinary(int a[],int x ){

        int left=0;
        int right=a.length-1;

        while(left<=right)
        {
            int middle=(left+right)/2;

            if(x==a[middle]){

                return middle;
            }
            else if(x>a[middle]) {
                left=middle+1;
            }else {
                right=middle-1;
            }

        }


        return -1;
    }

    public static void main(String[] args) {
        int a[]={1,23,100,232,344,444,34,33};
       int result= BinarySearch.searchBinary(a,33);
        System.out.print("the number is the "+result+" place");
    }

}
