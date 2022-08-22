package Interview.AccoD;

import java.util.*;

public class FindKLargest {

    public static void main(String[] args) {
     int[] num= new int[]{2, 3, 55, 66, 88, 90};
        System.out.println(findKthLargestElement(num,2));

        Object o=new Object();

    }

    public static int findKthLargestElement(int[] nums,int k){

        Set<Integer> set=new TreeSet<Integer>();
        System.out.println(Arrays.toString(nums));
        int len=nums.length;
        for(int i=0;i<len;i++){
            set.add(nums[i]);
        }

        Iterator itr=set.iterator();
        int n=len-k;
        while(n>0){
            itr.next();
            n--;
        }
        Integer ret=(Integer)itr.next();
        int re=ret.intValue();
     

     return re;


    }


}
