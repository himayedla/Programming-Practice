package inovvapath;

public class LargestNumber {
	public static void isLargest(double[] arr){
		double largest = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>largest){
				largest = arr[i];
			}
			}
		System.out.println("Largest number is " + largest);
		
	}
	public static void main(String[] args){
		double[] arr = {30,4,32,35,26,126};
		isLargest(arr);
//		int largest = arr[0];
//		for(int i=1;i<arr.length;i++){
//			if(arr[i]>largest){
//				largest = arr[i];
//			}
//			}
		
		
	}

}
