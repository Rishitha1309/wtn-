package patterns;

import java.util.Scanner;

public class P3 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(""+i);
			}
			System.out.println();
		}
		sc.close();

}
}
