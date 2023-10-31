import java.util.Scanner;
public class Finalpattern {
     static void scalepattern()  {
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter the size of your pattern!");
        System.out.println("     ");
        System.out.println("Min: 1, Max: 100");
        System.out.println("     ");
        System.out.println("     ");

		int p = input.nextInt();
		char a='@';
	if (p>0	&& p<101) {
		for (int i=p; i>0; i--) {
			System.out.println();
			for( int j=i; j>0; j--) {
				System.out.print(a);	
			}
		}
	} else {
		System.out.println("This is an invalid input, Please to enter a value between 0 and 1000!");
	}
	}

    static void scaledpattern () {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the scale of your pattern!");
        System.out.println("     ");
        System.out.println("Min: 1, Max: 100");
        System.out.println("     ");
        System.out.println("     ");
		int s= input.nextInt();
		char d='*';	
		if ( s>0 && s <101) {
		for (int i=0; i<s; i++) {
			System.out.println();
			int k= i+1;
			for ( int j=0; j<k; j++) {
				System.out.print(d);
			
		}
	}
		} else { 
		System.out.println("Invalid input!, Please enter a value between 0 and 1000.");
		}
	}   

    public void show(){
        int killswitch=0;
        while (killswitch==0){
         Scanner enter = new Scanner(System.in);
         System.out.println("     ");
         System.out.println("     ");
         System.out.println("A=   \"@\" Reverse Right-Angled Pattern       and       B=  \"*\"  Right-Angled Pattern");
         System.out.println("     ");
         System.out.println("     ");
         System.out.println("Please choose a pattern type: A or B");
         System.out.println("     ");
         System.out.println("You can enter C to cancel!");
         System.out.println("     ");
         System.out.println("     ");

         String pick= enter.nextLine();
         String choose= pick.toUpperCase();
         switch (choose) {
            case "A":
            System.out.println("     ");
            System.out.println("     ");
            scalepattern();
            break;
            case "B":
            System.out.println("     ");
            System.out.println("     ");
            scaledpattern();
            break;
            case "C":
            killswitch=1;
            System.out.println("     ");
            System.out.println("     ");
            System.out.println("You have opted to cancel");
            System.out.println("     ");
            System.out.println("     ");
            break;
            default:
            System.out.println("     ");
            System.out.println("Invalid input, please choose A or B!");    
            System.out.println("     ");
    
        }
     }
    }
}