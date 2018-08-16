import java.util.*;
class ps18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[2];
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next();
        }
        String n=a[0];
        String n1=a[1];
        System.out.print(n.substring(0,1).toUpperCase()+""+n.substring(1).toLowerCase()+" "+n1.substring(0,1).toUpperCase()+""+n1.substring(1).toLowerCase());
    }
}
