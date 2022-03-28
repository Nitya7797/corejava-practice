import java.util.scanner;

public class HighestNumber {
     
//Add main method

 public static void main(String[] args)
   {
      int a,b,c;

//Declare the three variables

//Use the scanner class to provide input at execution time

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first number:");
      a=sc.nextInt();
      System.out.println("Enter the Second number:");
      b=sc.nextInt();
      System.out.println("Enter the Third number:");
      c=sc.nextInt();
      if(a>b && a>c)
         System.out.println(""+a+" is highest number");
      else if(b>c)
         System.out.println(""+b+" is highest number);
      else
         System.out.println(""+c+" is highest number");
   }
//check which number is highest using if else condition
//Print the highest of three numbers
 
}
