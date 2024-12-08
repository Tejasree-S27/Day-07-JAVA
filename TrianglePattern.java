/* Triangle
          *
        *   *
      *       *
    *           *
  *               *   
* * * * * * * * * * *

 */
import java.util.*;
    public class TrianglePattern
    {
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          n*=2;
            if(n%2==1)
            n-=1;
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=n;j++)
                {
                    if(i+j==n/2 || j-i==n/2 || i==n/2) 
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    System.out.print(" "+" ");
                }
                System.out.println();
            }                                     
        }
    }