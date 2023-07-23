interface FirstInterface{
    void display();
}
interface SecondInterface{
    void result();
}
class Access implements FirstInterface,SecondInterface{
   public void display(){
    System.out.println("It's Possible to access first interface");
    }
    public void result(){
        System.out.println("It's possible to access second interface");
    }
}
public class Muliple_Inheritance {
    public static void main(String[] args) {
        Access access=new Access();
        access.display();
        access.result();        
    }
}
