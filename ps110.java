import java.util.*;
class ps110
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s[]=new String[2];
        int c=0;
        int cn=0;
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.next();
        }
        String s1=s[0];
        String s2=s[1];
        String x="";
        String x1="";
        char ap[]=s1.toCharArray();
        char app[]=s2.toCharArray();
    Arrays.sort(ap);
    Arrays.sort(app);
    for(int i=0;i<ap.length;i++)
    {
        x=x+""+String.valueOf(ap[i]);
    }
    for(int i=0;i<app.length;i++)
    {
        x1=x1+""+String.valueOf(app[i]);
    }
    x=x.substring(0,x.length()-1);
    x1=x1.substring(0,x1.length()-1);
    if(x.equals(x1))
    {
        System.out.print("yes");
    }
    else
    {
        System.out.print("no");
    }
    }
}
