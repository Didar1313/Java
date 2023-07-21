public class Method_overloading {
    public static void main(String[] args) {
        hello();
        hello("didar");
        hello(23,"didar");
    }
    static void hello(){
        System.out.println("hello,this is didar");
    }
    
    static void hello(String name){
        System.out.println("hello,this is "+name);
    }
    static void hello(int age,String name){
        System.out.println("hello,this is "+name+" and i am "+age);
    }
}
