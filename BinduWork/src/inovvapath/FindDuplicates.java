package inovvapath;

import java.util.HashSet;

public class FindDuplicates {
	public static void main(String[] args){
		String[] s = {"a", "b", "c"};
		
		HashSet<String> set = new HashSet<String>();
		 
        for (String i : s)
        {
            if(!set.add(i))
            {
                System.out.println("Duplicate Element is : "+ i);
            }
        }
	}

}
