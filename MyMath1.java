class MathOperations {
  int value;
  int value1;
  public MathOperations (){
   value= 2;
   value1=5;
  }
}
  
class MyMath1 extends MathOperations {
  
public static void main(String[] args) {
MyMath1 myObj = new MyMath1();

int sub= myObj.value1-myObj.value;
int add= myObj.value1+myObj.value;
int multiply= myObj.value1*myObj.value;

System.out.println(sub);
System.out.println(add);
System.out.println(multiply);

 }

}