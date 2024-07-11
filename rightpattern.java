import java.lang.*;
import java.util.Scanner;

class rightpattern
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
		{
		for(j=1;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		
    }
}