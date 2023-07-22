public class StaticMethod_PublicMethod {
    static int staticMethod(int x) {
        return x * x;
        // System.out.println("Static methods can be called without creating objects");
    }

    static void staticMethod() {
         System.out.println("Static methods can be called without creating objects");
    }

    public void pblicMehtod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        int x = staticMethod(4);
        System.out.println(x);
        StaticMethod_PublicMethod obj = new StaticMethod_PublicMethod();
        obj.pblicMehtod();
        staticMethod();
    }
}
