public class Animal {
  String name;

  public void eat(){
    System.out.println("I can eat!");
  }
}

class Dog extends Animal{
  public void display(){
  System.out.println("My name is "+ name);

  }
}

class Doggystyle {


public static void main(String[] args){

Dog myObj = new Dog();
System.out.println("");
myObj.name= "Happy";
System.out.println("");
myObj.display();
System.out.println("");
myObj.eat();
System.out.println("");
  }

}
