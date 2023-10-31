//This program will print the last repeated character in an Array
import java.util.*;
public class ArrayLastChar {

  public void function() {
int counter= 0;
int myIndex= 0;

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



Arrays.sort(sArray);

//This for loop will check the array for repeat values
for (int i=0; i<sArray.length-1; i++){
int j= i + 1;
if (sArray[i]==sArray[j]){
  counter= counter+1;
}

}
//This for loop was used to create an array with the repeat members only called repeaters.
int[] repeaters= new int[counter];
for (int x=0; x<sArray.length-1; x++){
  int j= x + 1;
  if (sArray[x]==sArray[j]){
    repeaters[myIndex]= sArray[x];
    //the myIndex Variable will indicate the length of the new array
    myIndex=myIndex +1;
  }
}
System.out.println(" ");
// The index of the size of the array-1 will return the last value of an array. 

System.out.println("The Last value to repeat was: "+ repeaters[myIndex-1]);
System.out.println("");
}
  
}