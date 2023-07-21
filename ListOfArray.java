import java.util.ArrayList;
public class ListOfArray {
    public static void main(String[] args) {
        ArrayList<String> food=new ArrayList<String>();
        food.add("Apple");
        food.add("Mango");
        food.add("Potato");
        food.add("pinaple");
        food.set(0, "banana");
        food.remove("pinaple");
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
    
}
