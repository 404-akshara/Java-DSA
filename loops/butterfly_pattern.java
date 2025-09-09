public class pattern_11 {
    public static void main(String[]args)
    {
       for(int i=1;i<=4;i++)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        int a=2*(4-i);
        for(int k=1;k<=a;k++)
        {
            System.out.print(" ");
        }
        for(int l=1;l<=i;l++)
        {
            System.out.print("*");
        }
         System.out.println();
       }

       for(int i=1;i<=4;i++)
       {
        for(int j=4;j>=i;j--)
        {
            System.out.print("*");
        }
        int a=2*(i-1);
        for(int k=1;k<=a;k++)
        {
            System.out.print(" ");
        }
        for(int l=4;l>=i;l--)
        {
            System.out.print("*");
        }
        System.out.println();
       }
      
    }
}
