public class NewWayRomario {
  protected int value,value1;
  public NewWayRomario (int i ,int o){
    this.value = i;
    this.value1 = o;
  }
} 
 

class Mathquestion extends NewWayRomario {
  public Mathquestion (int i ,int o)
  {
    super(i,o);
  }   
  //Methods of the subclass
 
  public int sub (){
   
    return this.value1 - this.value;
   
  }
  public int add()
  {
    return this.value + this.value1;
  }
  public int multiply()
  {
    return this.value * this.value1;
  }
public static void main(String[] args){
  Mathquestion myObj = new Mathquestion(2,5);
System.out.println("When added: "+myObj.add());
System.out.println("When subtracted : "+myObj.sub());
System.out.println("When multipled: "+myObj.multiply());
}
}
