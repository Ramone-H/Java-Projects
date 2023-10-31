//This program will remove all the repeated character in an Array
import java.util.*;
public class ArrayRemoveRepeat{
public void function() {
  
int repeatValCount= 0;
int count=1;

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

//This for loop is used to check the frequency of repeat values.

for (int i=0; i<sArray.length-1; i++){
int j= i + 1;
if (sArray[i]==sArray[j]){

 //This will count the amount of times the values repeat themselves
 repeatValCount=  repeatValCount + 1; 
}

}

//this will represent the size of the new array to be created
int fixedArraysize = sArray.length-repeatValCount;
int[] fixedArray = new int [fixedArraysize];
System.out.println("");
System.out.println("This is the original Array");
System.out.println("");
for (int b=0; b<sArray.length; b++){
  System.out.println(sArray[b]);
}
System.out.println("");
System.out.println("This is the updated array without repeat values");
System.out.println("");
//This for loop will be used to create the new array that will exclude all the values that repeat.

for (int k=0; k< sArray.length-1; k++){
 int l= k + 1;
 fixedArray[0] =sArray[0];
 if (sArray[k]!= sArray[l]){
  fixedArray[count]= sArray[l];
  count=count+1;
}
}
//This will print the updated array.
for(int m=0;m<fixedArraysize; m++)
System.out.println(fixedArray[m]);
}
}

