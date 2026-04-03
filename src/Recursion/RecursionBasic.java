package Recursion;

public class RecursionBasic {
    public void IncreasingInteger(int n){
        if(n==0) return;
        IncreasingInteger(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        RecursionBasic obj= new RecursionBasic();
        obj.IncreasingInteger(5);
    }
}
