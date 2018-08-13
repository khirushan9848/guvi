import java.util.*;
class guvihunters12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            c[i]=sc.nextInt();
        }
        Arrays.sort(c);
        for(int i=0;i<n;i++)
        {
            sum=sum+c[i];
        }
        if(sum!=0)
        {
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
        }
        else
        {
            System.out.print("0");
        }
    }
}
