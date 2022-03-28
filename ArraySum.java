public class ArraySum {

//Define the main method
 public static void main(String[] args)
    {
        int n,i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter "+n+" elements: ");
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of array elements is : "+sum);
        
    }
//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result

}
