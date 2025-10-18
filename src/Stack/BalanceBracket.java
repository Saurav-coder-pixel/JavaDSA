package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {
    public static boolean Balance(String s){
        Stack<Character> st= new Stack<>();
        int n= s.length();
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            if(ch== '(') {
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                if (ch== ')') st.pop();
            }
        }
        return st.isEmpty();
    }

    public static int Balancing(String s){
        Stack<Character> st= new Stack<>();
        int n= s.length();
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            if(ch== '(') {
                st.push(ch);
            }else if(ch== ')'){
                if(!st.isEmpty() && st.peek()== '(') {
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(Balance(str));
        System.out.println(Balancing(str));
    }
}
