package Interview.AccoD;

import java.util.List;
import java.util.stream.Collectors;

public class SingletonClass implements Cloneable{

    public static SingletonClass singletonClass;

    private SingletonClass(){

    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static SingletonClass getSingletonClass() throws InterruptedException {

        synchronized(SingletonClass.class){
            if (singletonClass == null) {
                Thread.sleep(30000);
                singletonClass = new SingletonClass();
            }
        }
        return singletonClass;
    }



    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

       // String s="aeiou";
       // String str="My Name is Shashank Tiwari";
       // List<Character> vowelArr=s.chars().mapToObj(e->(char)e).collect(Collectors.toList());
       // char[] arrVowel=s.toCharArray();
        //List<Character> strArray=str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
         /*Thread t=new Thread(){

             public void run(){
                 SingletonClass sing= null;
                 try {
                     sing = SingletonClass.getSingletonClass();
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 System.out.println(" Printing the hashcode for t1 object ");
                 System.out.println(sing.hashCode());

             }
         };

        Thread t2=new Thread(){

            public void run(){
                SingletonClass sing1= null;
                try {
                    sing1 = SingletonClass.getSingletonClass();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Printing the Hashcode for t2 thread");
                System.out.println(sing1.hashCode());
            }
        };

        t.start();
        t2.start();*/

        SingletonClass instance1 = SingletonClass.getSingletonClass();
        SingletonClass instance2 = (SingletonClass) instance1.clone();
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());





    }


}
