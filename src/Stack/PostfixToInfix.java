package Stack;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str ="953+4*6/-";    // -9/*+5346"
        System.out.println(str);

        Stack<String> val = new Stack<>();

        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            int arisc= (int) ch;

            if(arisc>=48 && arisc<=57){
                String s = ch+ "";
                val.push(s);
            }else {
                String v1 = val.pop();
                String v2 = val.pop();
                String t =  "(" + v2 + ch + v1 + ")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
