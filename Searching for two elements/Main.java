import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int cnt1=0,cnt2=0,i1=0,i2=0;
      int arr[]=new int[100];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int e1=s.nextInt();
      int e2=s.nextInt();
      for(int i=0;i<n;i++)
      {
        if(e1==arr[i])
        {
          i1=i;
         cnt1++;
        }
        if(e2==arr[i])
        {
          i2=i;
         cnt2++;
      }
      }
      if(cnt1==1)
      System.out.println(i1);
      else
        System.out.println("-1");
      if(cnt2==1)
      System.out.println(i2);
      else
        System.out.println("-1");
    }
}