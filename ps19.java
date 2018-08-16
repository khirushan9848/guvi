import java.util.*;
class ps19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[2];
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int n=a[0];
        int n1=a[1];
        int k=0;
        int y=(n1-n+1);
        int h[]=new int[y];
        for(int i=n;i<=n1;i++)
        {
            h[k]=i;
            k++;
        }
        int cn=0;
        for(int i=0;i<h.length;i++)
        {
           for(int j=2;j<h[i];j++)
           {
               if(h[i]%j==0)
               {
                   c++;
               }
           }
           if(c==0)
           {
               cn++;
           }c=0;
        }
        System.out.print(cn);
    }
}
