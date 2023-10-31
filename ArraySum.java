import java.util.Scanner;
//This program will print the sum of all the values in an Array
public class ArraySum {
  public void function(){
int sum=0;

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


//This for loop will add all the values in the array.

for (int i=0; i<sArray.length; i++){
sum= sum + sArray[i];
}
System.out.println(" ");
System.out.println("The sum of the value is: " + sum);
System.out.println(" ");

}
}
  

