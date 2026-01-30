package Arrays;

import java.util.Scanner;

public class PrefixSum {

    public void printArray(int[] arr){
        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public int totalSum(int[] arr){
        int totalSum=0;

        for(int i=0; i<arr.length; i++){
            totalSum+= arr[i];
        }
        return totalSum;
    }

    public int[] prefixSum(int[] arr){
        int prefix=0;
        for(int i=1; i<arr.length; i++){
//            prefix= arr[i] + prefix;
//            arr[i]= prefix;
            arr[i]= arr[i-1] + arr[i];
        }
        return arr;
    }

    public boolean EqualSum2(int[] arr){
        int n= arr.length;
        int totalSum= totalSum(arr);
        int prefix=0;

        for (int i=1; i<n; i++){
            prefix += arr[i];
            int suffix= totalSum- prefix;
            if(prefix== suffix){
                return true;
            }
        }
        return false;
    }

    public boolean EqualSum(int[] arr){
        int n= arr.length;
        System.out.println();
        prefixSum(arr);

        for (int i=1; i<n; i++){
            if(arr[i]== arr[n-1]-arr[i]){
                return true;
            }
        }
        return false;
    }

    public int[] suffixSumArray(int[] arr){
        int prefix=0;
        for(int i=arr.length-2; i>=1; i--){
//            prefix= arr[i] + prefix;
//            arr[i]= prefix;
            arr[i]= arr[i+1] + arr[i];
        }
        return arr;
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of element in Array:");
        int n= sc.nextInt();
        int[] arr= new int[n+1];
        System.out.println("Enter element of array:");

        for (int i=1; i<=n; i++){
            arr[i]= sc.nextInt();
        }

        PrefixSum obj= new PrefixSum();
//        int[] pref= obj.prefixSum(arr);
//        obj.printArray(arr);

//        System.out.println("Enter no. of queries:");
//        int q= sc.nextInt();
//
//        while (q-- >0){
//            System.out.println("Enter the bound to find sum:");
//            int l= sc.nextInt();
//            int r= sc.nextInt();
//            int sum= pref[r]- pref[l-1];
//            System.out.println("Sum: "+sum);
//        }

//        System.out.println(obj.EqualSum2(arr));

        obj.suffixSumArray(arr);
        obj.printArray(arr);

    }
}
