/*

      *
    *   *
  *       *
*           *
  *       *
    *   *
      *

 */
import java.util.*;
class HallowDiamond
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==1)
        n-=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i+j==n/2||i-j==n/2||j-i==n/2||i+j==n+(n/2))
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+ " ");
                }
               
            }
             System.out.println( );
        }
    }

}