package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {

    public static int[] sort(int[] intArr){

        int len=intArr.length;
        int[] result=new int[len];
        for(int i=1;i<len;i++) {
            int temp = intArr[i];
            int j = i - 1;

            /** Compairing with temp as intArr[i] will keep on changing **/
            while (j >= 0 && intArr[j] > temp ) {
               intArr[j+1]=intArr[j];
               j--;
            }

            intArr[j+1]=temp;
        }
        return intArr;
        }



    public static void main(String[] args) {

        int[] intArr={5,25,9,53,8,19,10,13};
       int[] sortedArray = InsertionSort.sort(intArr);

        System.out.println(Arrays.toString(sortedArray));

    }



}
