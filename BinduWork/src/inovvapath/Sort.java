package inovvapath;
import java.util.Arrays;

public class Sort {
//	static void bubbleSort(int[] arr){
//		int temp;
//		for(int i=0;i<arr.length;i++){
//			for(int j=0;j<arr.length;j++){
//				if(arr[i] < arr[j+1]){
//					temp = arr[j+1];
//					arr[j+1] = arr[i];
//					arr[i] = temp;
//					}
//			}
//			
//		}
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
//	}
	public static void main(String[] args) {
		int[] arr = {30,4,32,35,26};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
		
		//bubbleSort(arr);
		}
}
