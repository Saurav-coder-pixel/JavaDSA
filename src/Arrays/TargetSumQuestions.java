package Arrays;

public class TargetSumQuestions {
    public int TripletSum(int[] arr, int target){
        int n= arr.length;
        int ans=0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+ arr[j]+ arr[k]== target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public int UniqueNumber(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans= 0;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans= arr[i];
            }
        }
        return ans;
    }

    public int MaxElement(int[] arr){
        int max= Integer.MIN_VALUE;
        int n= arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }

    public int KthMax(int[] arr, int k){
        int n= arr.length;

        for(int i=0; i<k-1; i++){
            int max= MaxElement(arr);
            for(int j=0; j<n; j++){
                if(arr[j]== max){
                    arr[j]= Integer.MIN_VALUE;
                }
            }
        }
        return MaxElement(arr);
    }

    public int RepeatElement(int arr[]){
        int n= arr.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]== arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={1,8,6,2,3,4};
        TargetSumQuestions obj= new TargetSumQuestions();
//        System.out.println(obj.TripletSum(arr, 7));

        int[] arr1={1,2,3,4,2,1,3};
//        System.out.println(obj.UniqueNumber(arr1));

        int[] arr2={8,3,8,5,9,2,9};
//        System.out.println(obj.MaxElement(arr2));
//        System.out.println(obj.KthMax(arr2, 3));
        System.out.println(obj.RepeatElement(arr2));
    }
}


