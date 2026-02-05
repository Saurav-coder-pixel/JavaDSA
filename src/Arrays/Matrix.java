package Arrays;

public class Matrix {
    public void revese(int[] arr){
        int start=0;
        int end= arr.length-1;

        while(start< end){
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public int[][] TransposeOfMatrix(int[][] arr){
        int r= arr.length;
        int c= arr[0].length;
        int[][] trans = new int[c][r];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                trans[j][i]= arr[i][j];
            }
        }
        return trans;
    }

    public int[][] TransposeOfMatrixInplace(int[][] arr){
        //In-place transpose is only possible for square matrices because rows and columns must map one-to-one.
        int n= arr.length;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
        return arr;
    }

    public int[][] rotateBy90Deg(int[][] arr){
        TransposeOfMatrixInplace(arr);
        int r=arr.length;

        for(int i=0; i<r; i++){
            revese(arr[i]);
        }
        return arr ;
    }

    public int[][] pascalTriangle(int n){
        int[][] arr= new int[n][];

        for(int i=0; i<n; i++){
            arr[i]= new int[i+1];
            arr[i][0]= arr[i][i]= 1;

            for(int j=1; j<i; j++){
                arr[i][j]= arr[i-1][j] + arr[i-1][j-1];
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[][] arr= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix obj= new Matrix();
        Array_2D obj2= new Array_2D();

//        int[][] arr2 =obj.TransposeOfMatrix(arr);
//        obj2.printArray(arr2);

//        int[][] arr3= obj.TransposeOfMatrixInplace(arr);
//        obj2.printArray(arr3);
//        obj.rotateBy90Deg(arr);
//        obj2.printArray(arr);

        int[][] arr3= obj.pascalTriangle(5);
        obj2.printArray(arr3);
    }
}
