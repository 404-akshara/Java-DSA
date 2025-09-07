public class pattern_6
{
    public static void main(String[]args)
    {
        //for rows-outer loop
    for(int i=1;i<=4;i++)
    {
        //for spaces-inner loop
      for(int j=1;j<=4-i;j++)
      {
        System.out.print(" ");
    }
    // for stars
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
      System.out.println();
    }
}
}