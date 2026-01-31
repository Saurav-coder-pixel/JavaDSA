package Arrays;

public class Array_2D {
    public void printArray(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int[][] addMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1!= r2 || c1!= c2){
            System.out.println("Array Cannot be added");
        }
        int[][] res= new int[r1][c1];

        for (int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                res[i][j] = a[i][j]+ b[i][j];
            }
            System.out.println();
        }
        return res;
    }

    public int[][] multiplyMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1!= r2){
            System.out.println("Array Cannot be Multiply");
        }

        int[][] res= new int[r1][c2];

        for (int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++) {
                    res[i][j] += a[i][k]* b[k][j];
                }
            }
            System.out.println();
        }
        return res;
    }

    public static void main(String[] args){
        int[][] arr1={{1,2,1},{3,1,2}};
        int[][] arr2={{2,1},{1,3},{1,1}};

        Array_2D obj= new Array_2D();
        int[][] res= obj.multiplyMatrix(arr1,2,3,arr2,3,2);
        obj.printArray(res);
    }
}
