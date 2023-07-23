import java.util.ArrayList;
import java.util.Iterator;

public class IteratorAccess {
    public static void main(String[] args) {
        ArrayList<Integer> myArray=new ArrayList<>();
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        Iterator<Integer> it=myArray.iterator();
        System.out.println(it.next());
    }
    
}
