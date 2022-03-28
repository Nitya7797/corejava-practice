import java.util.*;
class Prime
{
   public static void main(String[] args)
   {
      int f,l,j,i;
      System.out.println("Enter Starting Number: ");
      System.out.println("Enter ending Number: ");
      Scanner sc=new Scanner(System.in);
      f=sc.nextInt();
      l=sc.nextInt();
      for(i=f;i<=l;i++)
      {
          for(j=2;j<=i;j++) 
          {
              if(i%j==0)
               break;
          }
          if(i==j)
            System.out.println(j);
        
      }
   }
}
