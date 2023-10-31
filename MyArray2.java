import java.util.Scanner;

public class MyArray2 {
  public static void main(String[] args) {
    Scanner enter= new Scanner(System.in);
    int[] numberarray= new int[5];
    for (int i=0; i<5; i++){
      System.out.println(" ");
      System.out.println(" Please enter a value for the array");
      System.out.println(" ");
      numberarray[i]= enter.nextInt();
      System.out.println(" ");
    }
    for (int j=0; j<5; j++){
      System.out.println(" ");
      System.out.println(numberarray[j]);
      System.out.println(" ");

    }

  }
}
