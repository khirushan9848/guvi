import java.util.*;
class guvihunter11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        String f="";
        for(int i=0;i<a.length;i++)
        {
            for(int j=a[i].length()-1;j>=0;j--)
            {
                f=f+a[i].charAt(j);
                //System.out.print(f);
            }
            System.out.print(f);
            f="";
            System.out.print(" ");
        }
    }
}
