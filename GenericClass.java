public class GenericClass {
    public static void main(String[] args) {
        MyGeneric<Integer> myInt=new MyGeneric<>(1);
        MyGeneric<Double> myDouble=new MyGeneric<>(1.2);
        MyGeneric<String> string=new MyGeneric<>("D");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(string.getValue());

    }
    
}
class MyGeneric <Thing>{
    Thing x;
    MyGeneric(Thing x){
        this.x=x;
    }
    public Thing getValue(){
        return x;
    }
}
