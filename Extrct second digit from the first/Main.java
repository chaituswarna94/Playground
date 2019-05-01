import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num=0,k;
      while(n>0)
      {
        num=n%10;
        if(n/100==0)
          break;
        n=n/10;
      }
      System.out.println(num);
    }
}