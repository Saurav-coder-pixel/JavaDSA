package Stack;

import java.util.Stack;

public class StackInstertion {
    public static void pushAtIdx(Stack<Integer> s, int x, int idx){
        if(s.size()== idx) {
            s.push(x);
            return;
        }
        int top= s.pop();
        pushAtIdx(s, x, idx);
        s.push(top);
    }

    public static void pushAtBottom(Stack<Integer> s, int x){
        if(s.size()== 0) {
            s.push(x);
            return;
        }
        int top= s.pop();
        pushAtBottom(s, x);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()) return;
        int x= s.pop();
        reverseStack(s);
        pushAtBottom(s, x);
    }

    public static void main(String[] args){
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
//        int idx= 2;
//        int x=7;

//        Stack<Integer> s= new Stack<>();
//        while (st.size()>idx){
//            s.push(st.pop());
//        }
//        st.push(x);
//        while (!s.isEmpty()){
//            st.push(s.pop());
//        }
//        System.out.println(st);

//        pushAtBottom(st, 0);
//        System.out.println(st);
//        reverseStack(st);
//        System.out.println(st);
        pushAtIdx(st, 7, 1);
        System.out.println(st);
    }
}
