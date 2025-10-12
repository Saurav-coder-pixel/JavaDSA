package Linked_List;

public class revLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }
    }

    public static Node reverseList(Node head){
        if(head== null || head.next== null) return head;
        Node newNode= reverseList(head.next);
        head.next.next=head;
        head.next= null;
        return newNode;
    }

    public static void display(Node head){
        Node temp= head;
        while (temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
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
        reverseList(a);
        display(a);
    }
}
