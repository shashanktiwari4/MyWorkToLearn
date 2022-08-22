package DSA.recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

//Pgm to print N number without using for loop.
public class PrintNum {

    static int i=1;
    static int n=0;
        public static void printN(){

            if(i<=n){
                System.out.println(i++);
                printN();
            }
        }

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
             n=sc.nextInt();
            printN();


        }



}
