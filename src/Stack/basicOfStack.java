package Stack;

import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.Stack;

public class basicOfStack {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of element");
        int n= sc.nextInt();
        System.out.println("Enter the numbers");

        Stack<Integer> st= new Stack<>();
        for (int i=1; i<=n; i++){
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println(st);


//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        System.out.println("Size: "+st.size());
//        System.out.println(st.peek());
    }
}
