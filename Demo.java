public class Demo {
    int x;
    int value;
    int valuenum1;
    int valuenum2;
    public Demo(){
        x=5;
        }
        public Demo (int num){
            value= num;
            
        }
        public Demo(int num1, int num2){
            valuenum1= num1;
            valuenum2= num2;


        }
    public static void main(String[] args){
        Demo myObj= new Demo();
        Demo myObj1= new Demo(20);
        Demo myObj2= new Demo(10,15);
        System.out.println("");
        System.out.println("");
        System.out.println("The value of the variable initiated in the default construtor is: "+myObj.x);
        System.out.println("");
        System.out.println("");
        System.out.println("The value of the variable initiated in the single parameterized constructor is:  "+myObj1.value);
        System.out.println("");
        System.out.println("");
        System.out.println("The values of the variables initiated in the double parameterized constructor are:  "+ myObj2.valuenum1 + " and "+ myObj2.valuenum2 );
        System.out.println("");
        System.out.println("");  

    }
}
