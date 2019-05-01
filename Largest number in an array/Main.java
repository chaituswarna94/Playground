import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int large=0;
      int arr[]=new int[100];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      for(int i=0;i<n;i++)
      {
        if(large>arr[i])
          continue;
        else
          large=arr[i];
      }
      System.out.println(large);
    }
}