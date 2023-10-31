//This program will do 5 different methods on a string of characters.
public class StringMethods {
  public static void main(String[] args) {
  String a ="This"; 
  String b = "  is my time ";


//Methods
String aUppercase= a.toUpperCase();// This functions makes all the characters Upper case.
String aLowercase =a.toLowerCase();// This functions makes all the characters Lower case.
int stringLength= a.length();// This will measure the size of the string.
char stringPosition = a.charAt(2);// This function will provide the character at the 3rd index
String c = a.concat(b);
int f= a.indexOf("i");

//display 

System.out.println(" ");
System.out.println( "The toUpperCase function makes all the characters Upper case:  "   + aUppercase);
System.out.println(" ");

System.out.println( "The toLowerCase makes all the characters Lower case: "   + aLowercase );
System.out.println(" ");
System.out.println( "The length function will measure the size of the string:  "   + stringLength );
System.out.println(" ");
System.out.println( "The charAt function will provide the character in the third position is:  "   +stringPosition );
System.out.println(" ");
System.out.println("The concat function will add two strings together: "  + c);
System.out.println(" ");
System.out.println(" ");
System.out.println("The concat function will add two strings together: "  + c);
System.out.println(" ");
System.out.println(" ");
System.out.println("The indexOf function will check the position or index of a charcter:  "+ f);
System.out.println(" ");
  }
  
}
