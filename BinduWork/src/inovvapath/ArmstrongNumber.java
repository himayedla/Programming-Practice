package inovvapath;
import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args){
	int n, sum=0,temp,r,d=0;
	
	System.out.println("Enter a number : ");
	Scanner input = new Scanner(System.in);
	n = input.nextInt();
	
	temp=n;
	
	while(temp != 0){
		d++;
		temp = temp/10;
		}
	temp = n;
	
	while(temp !=0){
		r = temp%10;
		sum = sum + power(r,d);
		temp = temp/10;
	}
	
	if(n == sum){
		System.out.println(n + " is an Amstrong number");
	}else{
		System.out.println(n + " is not an Amstrong number");
	}
	
}
static int power(int n,int r){
	int p=1;
	 for(int i=1;i <=r;i++){
		 p = p*n;
		 }
	return p;
}
}
