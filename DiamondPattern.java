import java.util.*;
public class DiamondPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int i, j, k, l, ch = 96;
		
		for (i = 1 ; i <= n; i++ ) 
		{
			for (j = i ; j <= n; j++ ) 
			{
				System.out.print(" ");	
			}
			for (k = 1 ; k <= i; k++ ) 
			{
				System.out.print((char)(ch+k));
			}
			for (l = i-1 ; l >= 1; l--) 
			{
				System.out.print((char)(ch+l));
			}
			System.out.println();
		}
		
		for (i = n - 1 ; i >= 1; i-- ) 
		{
			for (j = i ; j <= n - 1; j++ ) 
			{
				System.out.print(" ");
			}
			for (k = 1 ; k <= i; k++ ) 
			{
				System.out.print((char)(ch + k));
			}
			for (l = i-1 ; l >= 1;l--) 
			{
				System.out.print((char)(ch + l));
			}
			System.out.println();
		}
	}
}
