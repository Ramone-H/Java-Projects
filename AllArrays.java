import java.util.Scanner;

public class AllArrays {
  public void instruct() {
    
    ArrayFirstChar firstRepeat= new ArrayFirstChar();
    ArrayLastChar lastRepeat = new ArrayLastChar();
    ArrayRemoveRepeat repeatRemoval= new ArrayRemoveRepeat();
    ArraySecondHigh secondHigh= new ArraySecondHigh();
    ArraySum summation = new ArraySum();
    int killswitch=0;
    while (killswitch==0){

    Scanner sc = new Scanner (System.in);
    System.out.println("");
    System.out.println("");
    System.out.println("Please choose from one of the programs below");
    System.out.println("");    
    System.out.println("Choose A: This program will print the first repeated character in an Array!");
    System.out.println("");    
    System.out.println("Choose B: This program will print the last repeated character in an Array!");
    System.out.println("");    
    System.out.println("Choose C: This program will remove all the repeated character in an Array!");
    System.out.println("");    
    System.out.println("Choose D: This program will return the second highest value of an Array!");
    System.out.println("");    
    System.out.println("Choose E: This program will print the sum of all the values in an Array!");
    System.out.println("");    
    System.out.println("Choose F: To Cancel the program!");
    System.out.println("");
    String pick = sc.nextLine();
    String choose= pick.toUpperCase();

    switch(choose){
      case "A":
      System.out.println("");
      firstRepeat.function();
      break;
      case "B":
      System.out.println("");
      lastRepeat.function();
      break;
      case "C":
      System.out.println("");
      repeatRemoval.function();
      break;
      case "D":
      System.out.println("");
      secondHigh.function();
      break;
      case "E":
      System.out.println("");
      summation.function();
      break;
      case "F":
      System.out.println("");
      System.out.println("You have sucessfully cancelled the program");
      killswitch=1;
      break;
      default:
      System.out.println("you are out");

    }


  }
    


}


}
