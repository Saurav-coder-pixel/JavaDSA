package Arrays;

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

    public static void main(String[] args){
        Array4 obj= new Array4();
//        obj.SwapUsingSumAndDiif(4,5);

        int[] arr={1,2,3,4,5,6,7};
//        obj.ReverseAnArray(arr);

        obj.RotateArrInPlace(arr, 5);

    }
}
