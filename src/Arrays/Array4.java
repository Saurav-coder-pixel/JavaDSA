package Arrays;

import java.util.Scanner;

public class Array4 {
    public void SwapUsingSumAndDiif(int a, int b){
        System.out.println(a +" "+ b);
         a= a+b;
         b= a-b;
         a= a-b;
        System.out.println(a +" "+ b);
    }

    public int[] ReverseAnArray(int[] arr){
        int n= arr.length;
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public int[] RotateArr(int[] arr, int k){
        int n= arr.length;
        k= k%n;
        int[] ans= new int[n];
        int j= 0;

        for(int i=n-k; i<n; i++){
            ans[j++]= arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++]= arr[i];
        }
        return ans;
    }

    public void revese(int[] arr, int start, int end){
        while(start< end){
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void RotateArrInPlace(int[] arr, int k){
        int n= arr.length;
        k= k%n;

        revese(arr, 0, n-k-1);
        revese(arr, n-k, n-1);
        revese(arr, 0, n-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public int[] FrequencyArr(int[] arr){
        int[] feqArr= new int[100000];

        for(int i=0; i<arr.length; i++){
            feqArr[arr[i]]++;
        }
        return feqArr;
    }

    public static void main(String[] args){
        Array4 obj= new Array4();
//        obj.SwapUsingSumAndDiif(4,5);

        int[] arr={1,2,3,4,5,6,7};
        int[] arr2={5,6,5,400,560,1000,600};
//        obj.ReverseAnArray(arr);

//        obj.RotateArrInPlace(arr, 5);

        int[] freq= obj.FrequencyArr(arr2);

        System.out.println("Enter the number of queries");
        Scanner sc= new Scanner(System.in);
        int q= sc.nextInt();

        System.out.println("Enter the numbers to be search");
        while(q>0){
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            q--;
        }
    }
}
