import java.util.*;
class samenumpyramid
{
 public static void main(String args[])
 {
  int n;
  Scanner in= new Scanner(System.in);
  System.out.println("enter the number:");
  n=in.nextInt();
  int i,j,k,count=n-1,left=1,right=2;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=count;j++)
                {
                    System.out.print(" ");
                }
                for(j=left;j>=1;j--)
                {
                    System.out.print(j);
                }
				left++;
				if(i!=1)
				{
				for(j=2;j<right;j++)
				{
				System.out.print(j);
				}
				}
				right++;
                System.out.println();
				count--;
            }
            
        }


  }
 