package inovvapath;

public class MissingNumber {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,9};
		int r = a.length + 1;
		
		for(int i=0;i<a.length;i++){
			r += i+ 1-a[i];
		}
		
		System.out.println("missing number is : " + r);
		
		
	}
}
