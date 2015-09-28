package inovvapath;

public class fibanoci {
	 public static void main(String[] args) {
		 int Count = 15;
         int[] a = new int[Count];
         a[0] = 0;
         a[1] = 1;
         for(int i=2; i < Count; i++){
             a[i] = a[i-1] + a[i-2];
         }
 
         for(int i=0; i< Count; i++){
                 System.out.print(a[i] + " ");
         }
	 }
}

