import java.util.*;
public class TwoPairSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)            
        arr[i]=sc.nextInt();
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}