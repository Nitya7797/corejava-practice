import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
 public static void main(String[] args)
    {
        int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        r=sc.nextInt();
        System.out.println("Enter number of columns: ");
        c=sc.nextInt();
        int[][] a=new int[10][10];
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                System.out.println("Elements ["+i+","+j+"] : "+a[i][j]);
            }
        }
        int[][] transpose = new int[10][10];
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=r;j++)
            {
               transpose[j][i]=a[i][j]; 
            }
        }
        System.out.print("After Transpose Matrix :\n");
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                System.out.print(transpose[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    }
