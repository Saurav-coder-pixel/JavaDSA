package ArrayList;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer> l1= new ArrayList<>();

        l1.add(4);
        l1.add(3);
        l1.add(9);
        l1.add(5);

//        System.out.print(l1);
        System.out.println(l1.get(2));

        l1.add(1,7);
        l1.remove(2);
        l1.set(0,3);
        System.out.println(l1);
    }
}
