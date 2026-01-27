package Arrays;

public class TwoPointer {
    public void printArray(int[] arr){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private void swap(int[] arr, int left, int right) {
        int temp= arr[left];
        arr[left]= arr[right];
        arr[right]= temp;
    }

    public int[] Sort0and1(int[] arr){
        int count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]== 0){
                count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i< count){
                arr[i]= 0;
            }else{
                arr[i]= 1;
            }
        }
        return arr;
    }

    public int[] Sort0and1UsingPointer(int[] arr){
        int n= arr.length;
        int left= 0;
        int right= n-1;

        while(left< right){
            if(arr[left]> arr[right]){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]== 0){
                left++;
            }
            if(arr[right]== 1){
                right--;
            }
        }
        return arr;
    }

    public int[] sortArrayByParity(int[] arr){
        int n= arr.length;
        int left= 0, right= n-1;

        while (left<right){
            if(arr[left] % 2== 1 && arr[right] % 2== 0){
                swap(arr,left, right);
                left++;
                right--;
            }
            if(arr[left]%2== 0){
                left++;
            }
            if(arr[right]%2== 1){
                right--;
            }
        }
        return arr;
    }

    public int[] SortedSquareArr(int[] arr){
        int n= arr.length;
        int left= 0, right= n-1;
        int idx= 0;
        int[] ans= new int[n];

        while (left<= right){
            if(Math.abs(arr[left])> Math.abs(arr[right])){
                ans[idx++]= arr[left] * arr[left];
                left++;
            }else{
                ans[idx++]= arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public int[] SortedSquareArr2(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int idx = n - 1;
        int[] ans = new int[n];

        while (left <= right) {
            int LeftSqr = arr[left] * arr[left];
            int RightSqr = arr[right] * arr[right];

            if (LeftSqr > RightSqr) {
                ans[idx--] = LeftSqr;
                left++;
            } else {
                ans[idx--] = RightSqr;
                right--;
            }
        }
        return ans;
    }


    public static void main(String[] args){
        int[] arr={1,0,0,1,0,1,1,0,0};
        TwoPointer obj= new TwoPointer();
//        obj.Sort0and1(arr);
//        obj.printArray(arr);
//        obj.Sort0and1UsingPointer(arr);
//        obj.printArray(arr);

//        int[] arr1={1,2,3,4,5,6,7,8};
//        obj.sortArrayByParity(arr1);
//        obj.printArray(arr1);

//        int[] arr2= {-10, -3, -2, 8, 5, 3};
        int[] arr2= {-10, -5, -4, 1, 2, 9};
        int[] arr3= obj.SortedSquareArr2(arr2);
        obj.printArray(arr3);
    }
}
