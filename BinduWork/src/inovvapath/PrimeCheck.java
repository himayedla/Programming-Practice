package inovvapath;
import java.util.Scanner;

public class PrimeCheck {
	static int number;
	static int i=2;
	
	static boolean isPrime(int number){
		for(i=2;i<=number/2;i++){
			
			if(number % i == 0){
				return false;
				
			}
		
		}
		return true;
		
	}
	
 public static void main(String[] args){
//	 isPrime(5);
//	 isPrime(7);
//	 isPrime(4);
	 Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		if(isPrime(n)==true){
			System.out.println("prime number");
		}
		else{
			System.out.println("Not a prime number");
		}
//	
//		int flag = 0;
//		for(int i=2;i<n;i++){
//			if(n%i == 0){
//			System.out.println(n + " is not a prime number");
//			flag = 1;
//			break;
//			}
//		}
//		if(flag == 0){
//			System.out.println(n+" is a prime number");
//		}
		
 }
	
}
