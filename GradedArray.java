import java.util.Scanner;
public class GradedArray {
  public static void main(String[] args) {
  Scanner put = new Scanner (System.in);
  int sum= 0;
  int failCount=0;
  int [] grades = new int[5];
  for (int i=0; i<grades.length; i++){
  System.out.println(" ");
  System.out.println(" Please enter a grade!");
  System.out.println(" ");
  grades[i] = put.nextInt();
  }
  //This will check the sum of all the values
  for (int j=0; j<grades.length; j++){
     sum= sum + grades[j];
      if (grades[j]<50 ) {
      failCount= failCount +1;
      }
  }
  System.out.println(" ");
  System.out.println("   The total value is "+ sum);
  System.out.println(" ");
  System.out.println("The amount of fail grades is" + failCount);
  System.out.println(" ");

  }
}
