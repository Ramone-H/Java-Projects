public class Pattern4 {
  public static void show () {
  String a= "* ";
  String b= " ";
  int k=0;
  for (int i=5; i>0; i--) {
    System.out.println();
    for( int j=i; j>0; j--) {
      System.out.print(b);
      }
      k =k+1;
      for( int g=0; g<k; g++) {    
        System.out.print(a);
    }
  }
}
}
  