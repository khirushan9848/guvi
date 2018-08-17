import java.util.*;
class hs9
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
             for(j=1;j<c;j++)
             {
                 u=s[i]+s[j];
                 if(u==0)
                 {
                     cnt++;
                     System.out.print(s[i]+" "+s[j]);
                     break;
                 }
             }
             if(cnt!=0)
             {
                 break;
             }
        }
    }
}


