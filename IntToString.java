import java.util.Scanner;

public class IntToString {

//main method
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String s=Integer.toString(n);
        int m=s.indexOf('3');
        int p=s.indexOf('2');
        System.out.println("char at index position "+m+" ="+p);
    }
}
