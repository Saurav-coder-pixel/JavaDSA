package Stack;

public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }
    }
    public static class Stack{
        private Node head= null;
        private int size= 0;

        void push(int x){
            Node temp= new Node(x);
            temp.next= head;
            head= temp;
            size++;
        }

        void display(){
            Node temp= head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();
        }

        int pop(){
            if(size== 0) return -1;
            int x= head.data;
            head= head.next;
            return x;
        }

        int peek(){
            if(size== 0) return -1;
            return head.data;
        }
    }

    public static void main(String[] arg){
        Stack st= new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek()+" ");
    }
}
