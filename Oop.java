public class Oop {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.Break();
        System.out.println("The color of this car is "+myCar.color);
        System.out.println("Price "+myCar.price);
        myCar.ride("permission");
        
    }
    
}
class Car{
    String price="20000 taka only";
    String color="Blue";
    String brand="Noah";

    void ride(String name){
        System.out.println("You can ride it without "+name);
    }
    void Break(){
        System.out.println("Break the car");
        ride("key");
    }
}