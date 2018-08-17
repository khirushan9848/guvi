import java.util.*;
class hs16
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
            for(j=i+1;j<c;j++)
            {
                if(s[i]==s[j])
                {
                    cnt++;
                    System.out.print(s[i]);
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
