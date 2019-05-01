import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n,m,k;
      n=s.nextInt();
      m=s.nextInt();
      k=s.nextInt();
      if(n>m)
      {
        if(n>k)
          System.out.println(n);
      
        else
          System.out.println(k);
      }
      else 
      {
        if(m>k)
           System.out.println(m);
        else
           System.out.println(k);
          
        
    }
    }
}