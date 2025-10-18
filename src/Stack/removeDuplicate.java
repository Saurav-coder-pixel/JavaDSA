package Stack;

import java.util.Stack;

public class removeDuplicate {
    public static int[] reverse(int[] arr){
        Stack<Integer> st= new Stack<>();
        for(int i=0; i<arr.length; i++){
            int n= arr[i];
            if(st.isEmpty() || st.peek()!= arr[i]) {
                st.push(n);
            }
            else if(st.peek()== arr[i]){
                if(i==n-1 || arr[i]!= arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] res= new int[st.size()];
        for(int i= st.size()-1; i>=0; i--){
             res[i] =st.pop();
        }
        return res;
    }


    public static String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (st.isEmpty() || st.peek() != ch) {
                st.push(ch);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.reverse().toString();
    }


    public static void main(String[] args){
        int[] arr= {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] res= reverse(arr);
        String s= "aabbcddd";
        String result= removeDuplicateLetters(s);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println(result);
    }
}
