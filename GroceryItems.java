import java.util.Scanner;

public class GroceryItems {

//Define the main method
public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Float[] a= new Float[15];
        for(int i=0;i<n;i++)
        a[i]=sc.nextFloat();
        float large=a[0];
        for(int i=0;i<n;i++)
        {
            if(large<a[i])
            {
                large=a[i];
            }
        }
        System.out.println("The highest price you incurred is "+large+"");
    }
    }
