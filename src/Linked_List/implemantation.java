package Linked_List;

import java.awt.datatransfer.FlavorListener;

public class implemantation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
        }

        void insertAtStart(int data){
            Node temp= new Node(data);
            if(head== null){
                head = tail= temp;
            }else{
                temp.next= head;
                head= temp;
            }
            size++;
        }

        void insetAt(int idx, int val){
            Node t= new Node(val);
            Node temp= head;
            if(idx== size){
                insertAtEnd(val);
                return;
            }
            else if (idx== 0){
                insertAtStart(val);
                return;
            }
            for (int i=1; i<=idx-1; i++){
                temp= temp.next;
            }
            t.next= temp.next;
            temp.next= t;
            size++;
        }

        int getIdx(int idx){
           Node temp= head;
           for(int i=1; i<= idx; i++){
               temp =temp.next;
           }
           return temp.data;
        }

        void deleteIndxAt(int idx){
            Node temp= head;
            for (int i=1; i<=idx-1; i++){
                temp= temp.next;
            }
            temp.next= temp.next.next;
            tail =temp;
            size--;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtStart(7);
        ll.insertAtStart(6);
        ll.insetAt(1,2);
        ll.display();
        System.out.println();
        ll.deleteIndxAt(2);
        ll.display();
        System.out.println();
        System.out.println(ll.size);
        System.out.println(ll.getIdx(3));

    }
}



