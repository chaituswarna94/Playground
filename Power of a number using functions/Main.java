import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int exponent=s.nextInt();
      int res=power(base,exponent);
      System.out.println(res);
    }
  public static int power(int base,int exponent)
  {
    int baseres=1;
    baseres=base*base;
    for(int i=2;i<exponent;i++)
    {
      baseres=(baseres*base);
    }
    return baseres;
  }
}