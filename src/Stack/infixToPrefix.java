package Stack;

import java.util.Stack;

public class infixToPrefix {
    public static void main(String[] args){
        String str= "9-(5+3)*4/6";
        System.out.println(str);

        Stack<String> val= new Stack<>();
        Stack<Character> op= new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int arcsii= (int) ch;

            if(arcsii>=48 && arcsii<=57) {
                String s= "" + ch;
                val.push(s);
            }
            else if(op.isEmpty() || ch=='('|| op.peek()=='(')
                op.push(ch);

            else if (ch==')'){
                while (op.peek()!='('){
                    //work
                    String v2= val.pop();
                    String v1= val.pop();
                    char o= op.pop();
                    String t= o+ v1+ v2;
                    val.push(t);
                }
                op.pop();
            }

            else {
                if (ch == '-' || ch == '+') {
                    String  v2 = val.pop();
                    String v1 = val.pop();
                    char o= op.pop();
                    String t= o+ v1+ v2; // for postfix v1+v2+o
                    val.push(t);
                    //push
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o= op.pop();
                        String t= o+ v1+ v2;
                        val.push(t);

                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        while(op.size()>0){
            String  v2= val.pop();
            String v1= val.pop();
            char o= op.pop();
            String t= o+ v1+ v2;
            val.push(t);
        }
        String prefix= val.pop();
        System.out.println(prefix);
        }
    }
