public class GenericsMethod {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.2, 2.3, 3.4, 4.5, 5.6 };
        String[] string = { "a", "b", "c" };

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(string);

    }

    public static <Thing> void displayArray(Thing[] array) {
        for (Thing x : array) {
            System.out.println(x);
        }
    }
}
