public class Recursion {
    public static void main(String[] args) {

        int result = call(10);
        System.out.println(result);
    }

    public static int call(int x) {
        if (x > 0) {
            return  x + call(x - 1);
        } else {
            return 0;
        }
    }

}
