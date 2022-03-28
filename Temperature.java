import java.util.Scanner;

public class Temperature{

//Define the main method
 public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days");
        n=sc.nextInt();
        int[] a=new int[10];
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter the temperature of Day : "+i);
            a[i]=sc.nextInt();
        }
        float low=a[0];
        for(i=1;i<=n;i++)
        {
          if(a[i]<low)
          {
              low=a[i];
          }
        }
        System.out.println("The lowest temperature of the week "+(i-1)+" is "+low+" celsius");
    }
}
