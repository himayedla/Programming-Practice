package inovvapath;

public class SubstringReplace {
	public static void main(String[] args){
		String s = "Hello Friend";
		String search = "Friend";
		String replace = "Java";
		String result = "";
		int i;
		do{
			//Replace all matching sub strings
			System.out.println(s);
			i = s.indexOf(search);
			if(i != -1){
				result = s.substring(0 , i);
				result = result + replace;
				result = result + s.substring(i + search.length());
				s = result;
			}
			
		}while(i != -1);
	}
}
