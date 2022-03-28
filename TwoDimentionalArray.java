import java.util.Scanner;

public class TwoDimentionalArray {

//Define the main method
public static void main(String[] args)
    {
        int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column:");
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] a=new int[10][10];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
               
                a[i][j]=sc.nextInt();
                System.out.println("Enter arr["+i+"]["+j+"] : "+a[i][j]);
            }

        }
        int large=a[0][0];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(a[i][j]>large)
                {
                    large=a[i][j];
                }
            }
        }
        System.out.println("Largest element in array is "+large+" and its position is a["+(i-1)+"][2]");
        
    }
}
