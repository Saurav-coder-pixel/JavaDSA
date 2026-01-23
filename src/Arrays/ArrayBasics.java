package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public int[] smallestAndLargestElement(int[] arr){
        int small= arr[0];
        int large= arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]< small){
                small= arr[i];
            }
            if(arr[i]> large){
                large= arr[i];
            }
        }
        int[] ans={small, large};
        return ans;
    }

    public int[] KthsmallestAndLargestElement(int[] arr, int k){
        Arrays.sort(arr);
        int n= arr.length;
        return new int[]{arr[k-1], arr[n-k]};
    }

    public static void main(String[] args){
        ArrayBasics a= new ArrayBasics();

        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr= new int[x];

        for (int i=0; i<x; i++){
            arr[i]= sc.nextInt();
        }

        a.printArray(arr);
        int[] arr2= a.KthsmallestAndLargestElement(arr, 2);
        System.out.println();
        a.printArray(arr2);
    }
}
