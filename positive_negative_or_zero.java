import java.util.*;
class positive_negative_or_zero
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N>=0&&N<=1000)
        {
            if(N>0)
            {
            System.out.print("Positive");
        }
        else
        {
            System.out.print("Zero");
        }
        }
    }
}

