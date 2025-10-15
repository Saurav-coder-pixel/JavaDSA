package Stack;

public class ArrayImplementation {
    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x) {
            if (isFull()) return;
            arr[idx]= x;
            idx++;
        }

        void display(){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int pop(){
            if(isEmpty()) return -1;
            int top= arr[idx-1];
            arr[idx-1]= 0;
            idx--;
            return top;
        }

        int peek(){
            if(isEmpty()) return -1;
            return arr[idx-1];
        }

        int size(){
            return idx;
        }

        int capcity(){
            return arr.length;
        }

        boolean isFull() {
            if (idx == arr.length) return true;
            else return false;
        }

        boolean isEmpty(){
            if(idx== 0) return true;
            else return false;
        }
    }


    public static void main(String[] args){
        Stack st= new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek()+" ");
        System.out.println(st.size()+" ");
        System.out.println(st.capcity()+" ");
    }
}
