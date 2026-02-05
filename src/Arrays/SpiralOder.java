package Arrays;

public class SpiralOder {
    public int[][] sprialOder(int[][] arr){
        int r= arr.length;
        int c= arr[0].length;
        int totalElement= 0;

        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        while(totalElement< r*c){
            //topRow -> topRow to rightCol
            for(int j=leftCol; j<=rightCol; j++){
                System.out.print(arr[topRow][j]+ " ");
                totalElement++;
            }
            topRow++;

            //rightCol-> rightCol to bottomRow
            for(int i=topRow; i<=bottomRow; i++){
                System.out.print(arr[i][rightCol]+ " ");
                totalElement++;
            }
            rightCol--;

            //bottomRow-> bottomRow to leftCol
            for(int j=rightCol; j>=leftCol; j--){
                System.out.print(arr[bottomRow][j]+ " ");
                totalElement++;
            }
            bottomRow--;

            //leftCol-> leftCol to topRow
            for(int i=bottomRow; i>=topRow; i--){
                System.out.print(arr[i][leftCol]+ " ");
                totalElement++;
            }
            leftCol++;

        }
        return arr;
    }

    public int[][] sprialMatrix(int n){
        int[][] arr= new int[n][n];
        int r= arr.length;
        int c= arr[0].length;
        int curr=1;

        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        while(curr<= n*n){
            //topRow -> topRow to rightCol
            for(int j=leftCol; j<=rightCol; j++){
                arr[topRow][j]= curr;
                curr++;
            }
            topRow++;

            //rightCol-> rightCol to bottomRow
            for(int i=topRow; i<=bottomRow; i++){
                arr[i][rightCol]= curr;
                curr++;
            }
            rightCol--;

            //bottomRow-> bottomRow to leftCol
            for(int j=rightCol; j>=leftCol; j--){
                arr[bottomRow][j]= curr;
                curr++;
            }
            bottomRow--;

            //leftCol-> leftCol to topRow
            for(int i=bottomRow; i>=topRow; i--){
                arr[i][leftCol]= curr;
                curr++;
            }
            leftCol++;
        }
        return arr;
    }

    public static void main(String[] args){
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        SpiralOder obj= new SpiralOder();
        Array_2D obj2= new Array_2D();
        int[][] arr1= obj.sprialMatrix(3);
        obj2.printArray(arr1);
    }
}
