import java.util.*;
class hs21
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s[]=s1.split(" ");
        int cnt=0;
        int u=0,j=0,i=0;
        for(i=0;i<s.length;i++)
        {
            for(j=s[i].length()-1;j>=0;j--)
            {
               System.out.print(s[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
