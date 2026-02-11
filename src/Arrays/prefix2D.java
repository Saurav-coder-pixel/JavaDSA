package Arrays;

public class prefix2D {
    public int RectangleSum(int[][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[][] arr={
                {1,2,3,4,5},
                {2,3,4,5,6},
                {5,6,7,8,9},
                {1,2,3,4,5},
                {2,3,4,5,6}
        };
        prefix2D obj= new prefix2D();
        System.out.println(obj.RectangleSum(arr, 0,0,2,2));
    }
}
