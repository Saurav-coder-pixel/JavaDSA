package Stack;

import java.util.Stack;

public class StackImplementaion {
    public static void main(String[] args){
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

//        //Implemention using Stack
//        Stack<Integer> s= new Stack<>();
//        while (!st.isEmpty()){
//            s.push(st.pop());
//        }
//        while (s.size()>0){
//            int x= s.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }

        //Implemention using array
        int n= st.size();
        int[] arr= new int[n];
        for(int i=n-1; i>=0; i--){
            arr[i]= st.pop();
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
