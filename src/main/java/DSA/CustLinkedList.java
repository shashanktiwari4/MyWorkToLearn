package DSA;

public class CustLinkedList {

    Node h;

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public CustLinkedList addNode(int data, CustLinkedList cl) {

        Node new_node = new Node(data);
        if (cl.h == null) {
            cl.h = new_node;

        } else {
            Node last = cl.h;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;

        }

        return cl;
    }

    public void displayLinkedList(CustLinkedList Cc) {

        System.out.println("LinkedList --->");
        Node currNode = Cc.h;
        while (currNode != null) {
            System.out.print(currNode.data);
            System.out.print(" >> ");
            currNode = currNode.next;

        }
        System.out.println("null");


    }

    public static CustLinkedList deleteTailElement(CustLinkedList cl, int index) {

        Node currNode = cl.h;
        Node prev = null;
        int count = 0;
        while (currNode != null) {

            if (count == index) {
                prev.next = currNode.next;
                System.out.println(" Index deleted at the position " + index);
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                count++;
            }
        }
        System.out.println("Size of ll is --" + count);


        return cl;
    }


    public static void main(String[] args) {

        CustLinkedList ll = new CustLinkedList();
        ll = ll.addNode(20, ll);
        ll = ll.addNode(30, ll);
        ll = ll.addNode(40, ll);
        ll = ll.addNode(90, ll);
        ll = ll.addNode(55, ll);
        ll.displayLinkedList(ll);
        ll = deleteTailElement(ll, 4);
        System.out.println(" Printing after deleting tail element");
        ll.displayLinkedList(ll);


    }
}
