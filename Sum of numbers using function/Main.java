import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int res=sum(n);
      System.out.println(res);
	}
  public static int sum(int n)
  {
    int res=0;
    for(int i=1;i<=n;i++)
      res=res+i;
    return res;
  }
}