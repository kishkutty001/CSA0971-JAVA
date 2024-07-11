import java.io.*;
import java.util.Scanner;

class factnum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,n,j=0,fact=0,key;
        System.out.println("Enter the number:");
        n=in.nextInt();
		System.out.println("Enter the number to check its factor:");
        key=in.nextInt();
		int arr[] = new int[n];
        for(i=1;i<=n;i++)
		{
		if(n%i==0)
		{
		fact++;
		arr[j]=i;
		j+=1;
		
		}
		}
		System.out.println("number of factors:"+fact);
		System.out.println(key+"th factors:"+arr[key-1]);
		
    }
}