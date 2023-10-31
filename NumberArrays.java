import java.util.*;
public class NumberArrays {
    public static void main(String []args) {
    int[] myNumbers = new int[5];
    Scanner enter= new Scanner(System.in);
    for (int i=0; i<5; i++){
     System.out.println("Please enter a number!");
     myNumbers[i]=enter.nextInt();
    }   
    System.out.println("This is the original array!");
    
    for (int j=0; j<5; j++){
    System.out.println(myNumbers[j]);
    }

System.out.println("This is the sorted array!");

   Arrays.sort(myNumbers);//Sort Method used to sort the array of numbers entered
    for (int k=0; k<5; k++){
    System.out.println(myNumbers[k]);
    }
}
}
