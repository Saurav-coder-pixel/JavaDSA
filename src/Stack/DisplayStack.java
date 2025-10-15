package Stack;

import java.util.Stack;

public class DisplayStack {
    public static void displayReverseRec(Stack<Integer> s){
        if(s.size()==0) return;
        int top= s.pop();
        System.out.print(top+" ");
        displayReverseRec(s);
        s.push(top);
    }

    public static void displayRec(Stack<Integer> r){
        if(r.size()==0) return;
        int top= r.pop();
        displayRec(r);
        System.out.print(top+" ");
        r.push(top);
    }

    public static void main(String[] args){
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        displayReverseRec(st);
        System.out.println();
//        st.push(6);
        displayRec(st);
    }
}
