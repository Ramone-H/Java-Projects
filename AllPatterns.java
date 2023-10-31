import java.util.Scanner;

//This class will call all the patterns in Classroom Package
public class AllPatterns {
  public void instruct() {
  
  //Creating objects for the patterns
  Pattern1 rightAnglePatternReversed= new Pattern1();  
  Pattern2 doubleTrianglePattern = new Pattern2();
  Pattern3 rightAnglePattern = new Pattern3();
  Pattern4 pyramidPattern = new Pattern4();
  Pattern5 diamondPattern = new Pattern5();
  Finalpattern adjustablePatterns= new Finalpattern();
  int killswitch=0;

  while (killswitch==0){

  Scanner input= new Scanner(System.in);
  System.out.println(" ");
  System.out.println(" ");
  System.out.println("Please Select an option below");
  System.out.println(" ");
  System.out.println("Choose A: The Right-Angled Reverse Pattern");
  System.out.println("Choose B: The Double Triangle Pattern");
  System.out.println("Choose C: The Right-Angled Triangle With Numbers Pattern");
  System.out.println("Choose D: The pyramid Pattern");
  System.out.println("Choose E: The Diamond Pattern");
  System.out.println("Choose F: The Adjustable Right-Angled Patterns");
  System.out.println("Choose L: To Cancel!");
  System.out.println(" ");
  System.out.println("Which Option Do you Select?");
  System.out.println(" ");
  System.out.println(" ");
  String select = input.nextLine();
  String choose = select.toUpperCase();
  switch (choose) {
    case "A":
    System.out.println(" ");
    rightAnglePatternReversed.show();
    System.out.println(" ");
    break;
    case "B": 
    System.out.println(" ");
    doubleTrianglePattern.show();
    System.out.println(" ");
    break;
    case "C":
    System.out.println(" "); 
    rightAnglePattern.show();
    System.out.println(" ");
    break;
    case "D":
    System.out.println(" ");
    pyramidPattern.show();
    System.out.println(" ");
    break;
    case "E":
    System.out.println(" ");
    diamondPattern.show();
    System.out.println(" ");
    break;
    case "F":
    System.out.println(" ");
    adjustablePatterns.show();
    System.out.println(" ");
    break;
    case "L":
    killswitch=1;
    System.out.println(" ");
    System.out.println("You Have Successfully Canceled!");
    System.out.println(" ");
    break;
    default:
    System.out.println(" ");
    System.out.println("The Character(s) you have entered is invalid\nPlease select one of the options given!");
    System.out.println(" ");
   }
  }

  }
}
