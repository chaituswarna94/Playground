import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int fact=1,sum=0,temp=0;
      temp=num;
      while(num>0)
      {
        int m=num%10;
        for(int i=1;i<=m;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
        num=num/10;
        fact=1;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}