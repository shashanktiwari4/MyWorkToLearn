package DSA;

public class LList {

     Node head;

     static class Node{

        Node next;
        int data;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public static void insertList(LList ll, int d){

   Node new_node =new Node(d);
   if(ll.head==null){
       ll.head=new_node;
   }else{
        Node last=ll.head;
       while(last.next!=null){
           last=last.next;
       }
       last.next=new_node;
   }

    }



    public static void main(String[] args) {

         LList linkedList=new LList();
         insertList(linkedList,10);
        insertList(linkedList,50);
        insertList(linkedList,90);
        insertList(linkedList,440);

        System.out.print(linkedList.head.data);
        System.out.print(linkedList.head.next.data);
        System.out.print(linkedList.head.next.next.data);
    }

}
