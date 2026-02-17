package HashSet;

import com.sun.jdi.Value;

import java.util.HashMap;

public class HashMapQue1 {
    public static void main(String[] args){
        int[] arr= {1,2,3,1,4,1,4,4,4,4};
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i], 1);
            }else{
                mp.put(arr[i], mp.get(arr[i])+1);
            }
        }
        int maxFreq= 0, ansKey= -1;
        for (var e: mp.entrySet()){
            if(e.getValue()> maxFreq){
                maxFreq= e.getValue();
                ansKey= e.getKey();
            }
        }

        for (var key: mp.keySet()){
            if(mp.get(key)> maxFreq){
                maxFreq= mp.get(key);
                ansKey= key;
            }
        }

        System.out.println(ansKey);
    }
}
