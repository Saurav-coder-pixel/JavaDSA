package Stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class postfixEvaluation {
    public static void main(String[] args){
        String str= "953+4*6/-";

        Stack<Integer> val= new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int arcsii = (int) ch;

            if (arcsii >= 48 && arcsii <= 57) {
                val.push(arcsii - 48);
            } else {
                if (ch == '-' || ch == '+' || ch == '*' || ch == '/') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (ch == '+') val.push(v1 + v2);
                    if (ch == '-') val.push(v1 - v2);
                    if (ch == '*') val.push(v1 * v2);
                    if (ch == '/') val.push(v1 / v2);
                }
            }
        }
        System.out.println(val.peek());
    }
}


