import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class menu
{
   public static void main(String[]args) 
   {
    Scanner sc=new Scanner(System.in);
    
    for(int i=1; ; i++)
    {
             int a=sc.nextInt();
             if(a==1)
             {
            System.out.println("enter your number");
            int n=sc.nextInt();
            if(n>=90)
            {
                System.out.println("this is GOOD");
            }
            else if(n<=89 && n>=60)
            {
                
                System.out.println("This is also GOOD");
                System.out.println("BECAUSE MARKS DON'T MATTER BUT EFFORT DOES");
            }
            else if(n<=59 && n>=0)
            {
               System.out.println("This is GOOD as well");
               System.out.println("BECAUSE MARKS DON'T MATTER BUT EFFORT DOES");
            }
        } 
    
    else if(a==0)
    {
        System.out.println("STOP");
    }
    else
    {
        System.out.println("invalid number entered");
    }
     }

    }
}

