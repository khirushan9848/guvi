import java.util.*;
class guvihunters14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c[]=new int[n];
        int cn=0;
        for(int i=0;i<n;i++)
        {
            c[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(c[i]==c[j])
                {
                    cn++;
                }
            }
            if(cn==1)
            {
                System.out.print(c[i]+" ");
            }cn=0;
        }
    }
}
