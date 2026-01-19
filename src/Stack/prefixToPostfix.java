package Stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        System.out.println(str);

        Stack<String> val = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int arisc= (int) ch;

            if(arisc>=48 && arisc<=57){
                String s = ch+ "";
                val.push(s);
            }else {
                String v1 = val.pop();
                String v2 = val.pop();
                String t = v1 + v2 + ch;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}


