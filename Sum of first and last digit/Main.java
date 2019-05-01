import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m,k;
      m=n%10;
      while(true)
      {
        if(n/10==0)
        {
          k=n%10;
          break;
        }
        else
       
        n=n/10;
      }
        
      System.out.println(m+k);
	}
}