import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      int b[]=new int[1000];
      int temp=0,j=0,k=0;
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      j=n;
      for(int i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          b[j]=a[i];
          j--;
        }
        else
        {
          b[k]=a[i];
          k++;
        }
      }
      for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
    }
}