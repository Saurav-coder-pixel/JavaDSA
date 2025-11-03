package Sorting;

public class sorting {
    static void bubbleSort(int[] a){
        int n= a.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]> a[j+1]){
                    int temp= a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }
    
    static void selectionSort(int[] a){
        int n= a.length;
        for(int i=0; i<n-1; i++){
            int minIdx= i;
            for(int j= i+1; j<n-1; j++){
                if(a[j]< a[minIdx]){
                    minIdx= j;
                }
            }
            int temp= a[i];
            a[i]= a[minIdx];
            a[minIdx]= temp;
        }
    }

    static void insertionSort(int[] a){
        int n= a.length;
        for(int i=1; i<n; i++){
            int j=i;
            while (j>0 && a[j]< a[j-1]) {
                int temp= a[j];
                a[j]= a[j-1];
                a[j-1]= temp;
                j--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr={55, 44, 33, 11, 22, 66};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
