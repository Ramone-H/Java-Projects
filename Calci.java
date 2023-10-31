public class Calci {
int val1 =50; 
int val2=12;

public void add(){
  int sum =val1 + val2;
  System.out.println("The sum of the values are " + sum);
}
}
class AdvCalci extends Calci{
  public void sub(){
    int minus = val1 - val2;
    System.out.println("The difference between the two values are "+ minus);
  }

}

class VeryAdvCalci extends Calci{
public void mul(){
int multiply = val1 * val2;
System.out.println("The product of the two values are "+ multiply);
}
}

class Calculate{

  

public static void main(String[] args) {
AdvCalci myObj= new AdvCalci();
VeryAdvCalci myObj1 = new VeryAdvCalci();

System.out.println("");
myObj.add();
System.out.println("");
myObj.sub();
System.out.println("");
myObj1.mul();
System.out.println("");
}
}
