package Stack;

import java.util.Stack;

public class infixEvalution {
    public static void main(String[] args){
        String str= "-/6*4+359";

        Stack<Integer> val= new Stack<>();

        for(int i=str.length()-1; i>=0; i--) {
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
