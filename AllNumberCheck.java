import java.util.Scanner;

public class AllNumberCheck {
  
  //This method is used to check if the number entered is an odd or even number.

  static void evenChecker(int a){
    
    int remainder = a%2;
    if (remainder == 0)
      System.out.println("You have entered an Even number!");         
    else 
      System.out.println("You have entered an Odd number");   
 

  }

  //This method is used to check if the number entered is a prime number.

  static void primeChecker(int a){
    //the divider variable is used to divide the value that the user enters.
    int divider;
    // the factorCount variable is used to check how many factors a value has.
    int factorCount=0;

    for (divider=1; divider<=a; divider++){
      int remainder= a%divider;
      if(remainder==0){
        factorCount= factorCount + 1;
       /* System.out.println("");
        System.out.println("");
        System.out.println( "factor: " +   divider);
        System.out.println("");*/

      }
    }
   /*  System.out.println("");
    System.out.println("This number has " + factorCount+ " factors!"); */
    
    //This if statement evaluates the amount of factors a value has.
    if (factorCount==2){
      System.out.println("");
      System.out.println("The number you entered is also a prime number");
    

    } else{
      System.out.println("");
      System.out.println("The number you entered was not a prime number!");   

    }    

  }

public void instruct() {
  
  
  int killswitch =0;
  while (killswitch==0) {
  Scanner enter = new Scanner(System.in);
  System.out.println("");
  System.out.println("");
  System.out.println("Please to enter a value!\nOr you can enter negative value to cancel the program!");
  System.out.println("");
  System.out.println("");
  int a = enter.nextInt();
  System.out.println("");
  System.out.println("");

  if (a>0){
    evenChecker(a);
    primeChecker(a);
  } else {
    System.out.println("");
    System.out.println("Please enter a positive value greater than zero next time!"); 
    System.out.println("");
    killswitch =1;
  }
}

}

}
