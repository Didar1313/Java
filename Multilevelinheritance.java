 class Animal {
  String dogName="ricku";
  String pigName="sicku";
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}
class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
public class Multilevelinheritance{
  public static void main(String[] args) {
    Animal animal=new Animal();
    Animal pig=new Pig();
    Animal dog=new Dog();
    animal.animalSound();
    pig.animalSound();
    System.out.println("The name of this dog : "+pig.pigName);

    dog.animalSound();
    System.out.println("The name of this dog : "+dog.dogName);

  }
}