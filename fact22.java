import java.util.*;
class guvi22
{
    public static void main(String ar4sg[])
    {
        Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int fact=1;
       if(n<=25)
       {
          for(int i=1;i<=n;i++) 
          {
              fact=fact*i;
          }
       }
       System.out.print(fact);
    }
}
