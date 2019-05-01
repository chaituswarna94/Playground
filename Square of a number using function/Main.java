import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int res=square(n);
      System.out.println(res);
	} 
  public static int square(int n)
  {
    int res=n*n;
    return res;
  }
}