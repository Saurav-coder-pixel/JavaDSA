package Linked_List;


public class nthFromEnd {
    public static Node NthNode(Node head, int idx){
        int size=0;
        Node temp= head;
        while(temp!= null){
            size++;
            temp =temp.next;
        }

        int m= size-idx;

        temp=head;
        for(int i=1; i<=m; i++){
            temp= temp.next;
        }
        return temp;
    }

    public static Node NthNodeSF(Node head, int n){
        Node slow= head;
        Node fast= head;
        for(int i=1; i<=n; i++){
            fast= fast.next;
        }
        while (fast!= null){
            slow= slow.next;
            fast= fast.next;
        }
        return slow;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    public static void main(String[] arg){
        Node a= new Node(100);
        Node b= new Node(13);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node q= NthNodeSF(a,3);
        System.out.println(q.data);
    }
}
