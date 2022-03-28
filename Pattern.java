import java.util.*;
class Pattern_2
{
   public static void main(String[] args)
   {
      int n,i,j;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
         for(j=1;j<=i;j++)
         {
            if((i+j)%2==0)
            {
               System.out.print("1");
            }
            else
            {
               System.out.print("0");
            }
        }
         System.out.println(" ");
      }
   }
}
