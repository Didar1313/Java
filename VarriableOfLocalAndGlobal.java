import java.util.Random;

public class VarriableOfLocalAndGlobal {
    public static void main(String[] args) {
        Box myBox=new Box();
    }
}
class Box{
    /*for global, we need to declare in this area:-
    Random random;
    int nmuber; 
    then we need to change in constructor method,we just write in constructor 
    method is 'random=new Random();' and pass nothing in display method.
    And also display method dosen't receive anything.
     */
    Box(){
        Random random=new Random();
        int number=0;
        display(random,number);
    }
   void display(Random random,int number){
        int num=random.nextInt(10)+1;
        System.out.println(num);
    }
}