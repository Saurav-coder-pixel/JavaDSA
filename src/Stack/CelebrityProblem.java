package Stack;

import java.util.Stack;

class CelebrityProblem {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        Stack<Integer> s= new Stack<>();
        for(int i=0; i<n; i++){
            s.push(i);
        }

        while(s.size()>1){
            int v1= s.pop();
            int v2= s.pop();
            if(mat[v1][v2]==0){
                s.push(v1);
            }
            else if(mat[v2][v1]==0){
                s.push(v2);
            }
        }

        if(s.size()==0) return -1;

        int pot= s.pop();

        for(int i=0; i<n; i++){
            if(mat[i][pot]==0){
                if(i == pot) continue;
                return -1;
            }
        }

        for(int j=0; j<n; j++){
            if(mat[pot][j]==1){
                if(j == pot) continue;
                return -1;
            }
        }
        return pot;
    }

    public static void main(String[] args){
        int[][] persons={{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        CelebrityProblem celeb =new CelebrityProblem();
        int result= celeb.celebrity(persons);
        System.out.println(result);
    }
}
