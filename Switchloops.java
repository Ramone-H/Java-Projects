import java.util.Scanner;
public class Switchloops {
    public void forloops() {
		for (int num=1; num<10; num++) {
			System.out.println(num);}
		}
    public void whileLoops(){
        int num1 =1;
		while (num1<10) {
			System.out.println(num1);
			num1++;}
		}
    public void doWhileLoops(){
        int num2 =1;
		do {
			System.out.println(num2);
			num2++;
		}
		while (num2<10);
	
    }
    public static void main(String[] args) {
        Switchloops check = new Switchloops();
        System.out.println("");
        System.out.println("");
        System.out.println("Loop 1 : For Loop   Loop 2: While Loop   Loop 3: Do While Loop");
        System.out.println("");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose from one of the loops ");
        System.out.println("");
        System.out.println("");
        int choose = input.nextInt();
        System.out.println("");
        System.out.println("");
        switch(choose) {
            case 1: 
            System.out.println("This is an example of the for Loop!");
            System.out.println("");
            System.out.println("");
            check.forloops();
            System.out.println("");
            System.out.println("");
            break;
            case 2:
            System.out.println("This is an example of the while Loop!");
            System.out.println("");
            System.out.println("");
            check.whileLoops();
            System.out.println("");
            System.out.println("");
            break;
            case 3:
            System.out.println("This is an example of the Do While Loop!");
            System.out.println("");
            System.out.println("");
            check.doWhileLoops();
            System.out.println("");
            System.out.println("");
            break;
            default:
            System.out.println("");
            System.out.println("");
            System.out.println("You have entered an invalid input");
            System.out.println("");
            System.out.println("");
            
        }


    }
	}

