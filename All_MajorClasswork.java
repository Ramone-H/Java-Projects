import java.util.Scanner;

public class All_MajorClasswork {
  public static void main(String[] args) {
    AllArrays arrayWork= new AllArrays();
    AllNumberCheck checkNumber= new AllNumberCheck();
    AllPatterns patternWork = new AllPatterns();
    Scanner sc= new Scanner(System.in);
    int killswitch=0;
                      
    while (killswitch==0){
      System.out.println("");    
      System.out.println("Please to choose a category from the list below!");
      System.out.println("");    
      System.out.println("Choose A: To view all the major work done with arrays");
      System.out.println("");    
      System.out.println("Choose B: To view all the major work done with using the Conditional Statements");
      System.out.println("");    
      System.out.println("Choose C: To view all the major work done with creating patterns using conditional Statements");
      System.out.println("");    
      System.out.println("Choose D: To cancel");  
      System.out.println("");
      String pick = sc.nextLine();
      String choose= pick.toUpperCase();

    switch(choose){
      case "A":
      System.out.println("");
      arrayWork.instruct();
      break;
      case "B":
      System.out.println("");
      checkNumber.instruct();
      break;
      case "C":
      System.out.println("");
      patternWork.instruct();
      break;
      case "D":
      System.out.println("You have successfully cancelled");
      killswitch=1;
      break;
      default:
      System.out.println("Please to enter a valid option. Try Again!");
      
    }


    }

  }
}
