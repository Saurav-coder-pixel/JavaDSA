package Linked_List;

public class LLBasic {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }
    }

    public static void insertAtEnd(Node head, int val){
        Node temp= new Node(val);
        Node t= head;
        while (t.next!= null){
            t= t.next;
        }
        t.next= temp;
    }

    public static void display(Node head){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }

    public static void displayR(Node head){
        Node temp= head;
        if (temp == null) return;
            System.out.print(temp.data+" ");
            displayR(temp.next);
    }

    public static void displayRev(Node head){
//        Node temp= head;
        if (head == null) return;
        displayRev(head.next);
        System.out.print(head.data+" ");
    }

    public static int length(Node head){
        int count= 0;
        while(head!= null){
            count++;
            head= head.next;
        }
        return count;
    }

    public static void main(String[] args){
        Node a= new Node(1);
        Node b= new Node(3);
        Node c= new Node(6);
        Node d= new Node(9);
        Node e= new Node(7);

        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;

        display(a);
        System.out.println();
        displayR(a);
        System.out.println();
        displayRev(a);
        System.out.println();
        System.out.println(length(a));;
        insertAtEnd(a,10);
        display(a);
    }
}
