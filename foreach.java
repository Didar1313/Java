import java.util.ArrayList;

public class foreach {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        //String[] animals={"cat","dog","rat","bird"};
        for(String i : animals){
            System.out.println(i);
        }
    }
    
}
