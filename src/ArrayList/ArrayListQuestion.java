package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListQuestion {
    public void reverseArrayList(ArrayList<Integer> list){
        int i=0, j= list.size()-1;
        while (i<j){
            Integer temp= Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        ArrayListQuestion obj= new ArrayListQuestion();
        obj.reverseArrayList(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
