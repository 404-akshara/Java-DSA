import java.util.Scanner;

public class ODD_EVEN 
{
    public static void main(String[] args)
     {
      Scanner sc=new Scanner(System.in);
      int A=sc.nextInt();
      if(A>0 && A%2==0)
      {
        System.out.println("EVEN");
      }
      else if(A>0)
      {
        System.out.println("ODD");
      }
      else
      {
        System.out.println("INVALID NUMBER ENTERED");
      }
}
}
