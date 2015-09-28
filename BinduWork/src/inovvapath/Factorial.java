package inovvapath;
import java.util.Scanner;
public class Factorial {
	
	
	
	//factorial method using recursion
	public static int factorial(int n)
	{
		int result;
		if(n==0 || n==1)
			return 1;
		
		result = factorial(n-1) * n;
		return result;
	}
	
	
	public static void main(String[] args){
		//int r = factorial(5);
		//System.out.println("Factorial is " + r);
		int n,result;
		int f = 1;
		
		System.out.println("Enter the integer : ");
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
	
		if(n<0)
		{
			System.out.println("Number should not be negative or zero");
		}
		else{
		for(int i=1; i<=n; i++){
			f *= i;
			}
		System.out.println("Factorial of "+ n +" is " + f);
	}
		
		
	}
}
