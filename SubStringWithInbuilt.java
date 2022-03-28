import java.util.Scanner;

public class SubStringWithInbuilt {

//main method
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter search string: ");
        Scanner s=new Scanner(System.in);
        String str2=s.next();
        boolean res=str.contains(str2);
        if(res)
        {
            System.out.println(""+str2+" is found");
        }
        else
        {
            System.out.println(""+str2+" is not found");
        }
        
    }
