package DSA.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
By default, priority queue implements min heap. Min heap that is the top element  in heap.
 */
public class FIndNthLargestNum {

   public static int findNthLargest(int[] arr,int n){

       PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
       int len=arr.length;
       for(int i=0;i<n;i++){
           pq.add(arr[i]);
       }

       int nthLargest=0;

       for(int j=n;j<len;j++) {
           if (pq.peek()<arr[j]) {
                 pq.poll();
                pq.add(arr[j]);
           }
       }
     return pq.peek();
   }



    public static void main(String[] args) {

       int arr[]={24,89,100,30,1,2,3,6,9};
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
        System.out.print(n+"th largest element is :");
        System.out.println(findNthLargest(arr,n));

    }
}
