public class StringMethods2 {
  public static void main(String []args) {
  
   String word = "Terminate";
   String wordSpaced = "      Terminate ";

  //Contains Method
  System.out.println("");
  System.out.println(word.contains("er"));
  System.out.println("");
  System.out.println(word.contains("may"));
  System.out.println("");

  //Trim Method
  
  System.out.println(wordSpaced);
  System.out.println(wordSpaced.trim());
  //lastindexOf method
  System.out.println(word.lastIndexOf("e"));
  //replace  method: we have replaced all the e's with y
  System.out.println(word.replace('e','y'));
  // split method: The word terminate will be split into two. The break will be at 'i'
  String [] myWordSplit = word.split("i", 2);
  for (int i= 0; i< myWordSplit.length; i++){
  System.out.println(myWordSplit[i]);
  }
  //Substring method
   System.out.println(word.substring(3));
  //getBytes method
  byte[]wordBytes= word.getBytes();
  for (int j= 0; j<wordBytes.length; j++){ 
  System.out.println(wordBytes[j]);
  }
 //Equal method
 System.out.println(word.equals("Terminate"));
 System.out.println(word.equals("Entertain"));

//CompareTo Method
 System.out.println(word.compareTo("term"));
 System.out.println(word.compareTo("Terminate"));
 System.out.println(word.compareTo("Determination"));


//startsWith method
 System.out.println(word.startsWith("Ter"));
 System.out.println(word.startsWith("nate"));

//endsWith method
System.out.println(word.endsWith("Ter"));
System.out.println(word.endsWith("nate"));

}
}
