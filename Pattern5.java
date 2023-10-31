public class Pattern5 {
  public  void show () {
  String a=" *";
  String b= "  ";
  int n =9,q;
 int k=-1;
  for (int i=4; i>0; i--) {
    System.out.println();
    for( int j=i; j>0; j--) {
      System.out.print(b);
      }
      k=k+2;
      for( int g=0; g<k; g++) {    
        System.out.print(a);        
    }
  } 
  System.out.println("");
  for (int t= 9; t>0; t--){
    System.out.print(a);
  }
    
		for (int i=0; i<5; i++) {
			System.out.println();
			 q= i+1;
             n=n-2;

			for ( int j=0; j<q; j++) {
				System.out.print(b);
             }
             for (int p=n; p>0; p--){
                
                System.out.print(a);            
            }       
        
	} 
  
}
}
