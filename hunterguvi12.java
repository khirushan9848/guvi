import java.util.*;
class guvihunter12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int a[]=new int[n];
        int max=0;
        String f="";
        int g=0;
        for(int j=0;j<n;j++)
        {
            a[j]=sc.nextInt();
        }
        /*for(int i=0;i<n;i++)
        {
            for(g=0;g<n;g++)
            {
            if(a[g]>=max)
            {
                max=a[g];
            }
            }
            f=f+""+String.valueOf(max);
            max=0;
            g++;
        System.out.print(f);
        f="";
    }*/
    Arrays.sort(a);
    for(int i=0;i<n;i++)
    {
        f=f+String.valueOf(a[i]);
    }
        System.out.print(f.charAt(n-n1));
    // }
    }
}
