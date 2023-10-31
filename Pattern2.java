public class Pattern2 {
    public void show () {
		String d= " ";
        String e= "* ";
        int n =6,k;
       
		for (int i=0; i<5; i++) {
			System.out.println();
			 k= i+1;
             n=n-1;

			for ( int j=0; j<k; j++) {
				System.out.print(d);
             }
             for (int p=n; p>0; p--){
                System.out.print(e);            
            }       
        
	}
    int m=0;
  for (int q=5; q>0; q--) {
    System.out.println();
    for( int r=q; r>0; r--) {
      System.out.print(d);
      }
      m =m+1;
      for( int s=0; s<m; s++) {    
        System.out.print(e);
    }
  }
 }
}   
