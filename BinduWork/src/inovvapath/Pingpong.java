package inovvapath;
import java.util.Scanner;

public class Pingpong {
	
	public static String divisibleBy3(int number){
		
		 if(number % 3 == 0 && number % 5 == 0){
				return"ping pong";
			}
        else if(number % 5 == 0){
			
			return "ping";
			}
		else if(number % 3 == 0){
      	 
			return "pong";
		}
		else {
			return String.valueOf(number);
			
		}
		
		
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		 int a = input.nextInt();
	    String result = divisibleBy3(a);
	    System.out.println(result);
		
//		if(a % 3 == 0 && a%5 == 0){
//			System.out.println("Ping Pong");
//		}
//		else if(a % 3 == 0){
//			System.out.println("Ping");
//		}
//		else if(a%5 == 0){
//			System.out.println("Pong");
//		}
//		else{
//			System.out.println(a);
//			
//		}
	}
}

	


