import java.util.Random;
public class random_value {
    public static void main(String[] args) {
        Random random=new Random();
        int x=random.nextInt(11)+1;
        System.out.println(x);
    }
}
