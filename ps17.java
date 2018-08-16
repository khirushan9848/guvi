import java.util.*;
class ps17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char c[]=a.toCharArray();
        int j;
        String v="";
        for(int i=0;i<c.length-1;i++)
        {
                 if(i!=0)
                {
                     i++;
                }
                System.out.print(c[i+1]+""+c[i]);
                i=i++;
        }
    }
}
