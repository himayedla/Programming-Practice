package inovvapath;

import java.util.ArrayList;

public class ArrlistToArray {
	public static void main(String[] args){
		//Array list
		ArrayList<String> al = new ArrayList<String>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("four");
        System.out.println("Actual ArrayList:" + al);
        
        //Array
        String[] s = new String[al.size()];
        al.toArray(s);
        System.out.println("Elements in Array:");
        for(String str:s){
            System.out.println(str);
        }

}
}
