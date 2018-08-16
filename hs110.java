import java.util.*;
class hs110
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int c1=sc.nextInt();
        int s[]=new int[c];
        int s1[]=new int[c1];
        int cnt=0;
        for(int i=0;i<c;i++)
        {
            s[i]=sc.nextInt();
        }
        for(int i=0;i<c1;i++)
        {
            s1[i]=sc.nextInt();
        }
        for(int i=0;i<c1;i++)
        {
            for(int j=0;j<c;j++)
             {
                 if(s[j]==s1[i])
                 {
                     cnt++;
                 }
             }
        }
             if(cnt>0)
             {
                 System.out.print("YES");
             }
             else
             {
                 System.out.print("NO");
             }
        
    }
}

