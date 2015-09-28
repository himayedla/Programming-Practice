package inovvapath;

public class Swap {
	
	int a;
	int b;
	
	Swap(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public void swapTest(){
		int temp =a;
		a = b;
		b= temp;
	}
	public void swaptest1(){
		a = a+b;
		b = a-b;
		a = a-b;
	}
	
	public void print(){
		System.out.println("a= "+ a+ "; b= "+b);
	}
	
	public static void main(String[] args){
		Swap swap1 = new Swap(3, 5);
		swap1.print();
		//swap1.swapTest();
		//swap1.print();
		
		swap1.swaptest1();
		swap1.print();
	}
}
