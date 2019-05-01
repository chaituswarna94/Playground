import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int exponent=s.nextInt();
      int res=base*base;
      for(int i=2;i<exponent;i++)
      {
        res=res*base;
      }
      System.out.println(res);
    }
}