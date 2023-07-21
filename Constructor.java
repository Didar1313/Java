public class Constructor {
    public static void main(String[] args) {
        Human human=new Human("Didar",23,70);
        Human human2=new Human("Omar", 12, 30);
        System.out.println(human.age);
        System.out.println(human.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);
    }
}
class Human{
    int age;
    String name;
    int weight;
    Human(String name,int age,int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
}
