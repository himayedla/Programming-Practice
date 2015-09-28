package inovvapath;
import java.util.*;
public class CommonNum {
	public static void main(String[] args){
		int a[] = {10,8,5,3,6};
		int b[] = {20,15,16,8,5};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i=0,j =0;
		
		while(i<a.length && j < b.length){
			 if (a[i] == b[j]) {
			        System.out.println(a[i]);
			        i++;
			        j++;
			    } else if (a[i] > b[j]) {
			        j++;
			    } else {
			        i++;
			    }
	}

	}
	}
