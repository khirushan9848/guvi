import java.util.*;
class guvihunters13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c[]=new int[n];
        int cn=0;
        String v="";
        for(int i=0;i<n;i++)
        {
            c[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        if(c[i]==i)
        {
            cn++;
            v=v+c[i];
            // System.out.print(c[i]);
        }
        }
        char y[]=v.toCharArray();
        int o[]=new int[y.length];
        for(int i=0;i<y.length;i++)
        {
            o[i]=y[i]-'0';
        }
        Arrays.sort(o);
        if(cn==0)
        {
            System.out.print("-1");
        }
        else
        {
            for(int i=0;i<o.length;i++)
            {
                System.out.print(o[i]+" ");
            }
        }
    }
}
