import java.util.*;
class hs17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int s[]=new int[c];
        int cnt=0;
        int u=0,j=0,i=0;
        for(i=0;i<c;i++)
        {
            s[i]=sc.nextInt();
        }
        for(i=0;i<c;i++)
        {
            if((i%2==0)&&(s[i]%2!=0))
            {
                System.out.print(s[i]+" ");
            }
            if((i%2!=0)&&(s[i]%2==0))
            {
                System.out.print(s[i]+" ");
            }
        }
    }
}


