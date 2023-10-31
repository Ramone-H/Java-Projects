//This program outputs the second highest value of an Array.
import java.util.*;
public class ArraySecondHigh{
  public void function() {


  Scanner enter = new Scanner(System.in);
  System.out.println(""); 
  System.out.println("Please to confirm how many numbers you will add to the array!");
  System.out.println(""); 
  //This variable will confirm the length of the Array
  int myArraySize=enter.nextInt();
  //Array is initialized.
  int[] sArray = new int[myArraySize];
  //User will enter the values in the array based on the size.
  for (int r=0; r<myArraySize; r++ ){
    System.out.println(""); 
    System.out.println("Please enter a number in the Array");
    System.out.println(""); 
    sArray[r]= enter.nextInt(); 
  }


//The sort method will sort the values in the array in ascending order.
Arrays.sort(sArray);

//This for loop will print all the values from the array
for (int i=0; i<sArray.length; i++){
  System.out.println(sArray[i]);

}
//Space
System.out.println(" ");

// The size of a sorted array-2 will give the index of the second highest value.
int secondHighestIndex= sArray.length-2;
int SecondHighVal= sArray[secondHighestIndex];
System.out.println(" ");

System.out.println("The second highest value is: "+SecondHighVal);
System.out.println(" ");
}
}
