import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n,m;
      n=s.nextInt();
      m=s.nextInt();
      if(n>m)
        System.out.println("num1 is the greatest number");
      else
        System.out.println("num2 is the greatest number");
	}
}