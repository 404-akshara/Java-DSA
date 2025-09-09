public class palindromic_pattern {
    public static void main(String[]args)
    {
        for(int i=1;i<=5;i++)
        {
            //first spaces
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            //first numbers
            int a=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a);
                a--;
            }
            //second numbers
            int b=2;
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(b);
                b++;
            }
            //last spaces
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
