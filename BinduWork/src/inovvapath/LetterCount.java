package inovvapath;

public class LetterCount {
	public static void main(String[] args){
	String s = "This is nice";
	//String c = "";
	int count = 0;
	
	for(int i=0;i<s.length();i++){
		if(s.charAt(i) == ' '){
			System.out.println("count is " + count );
			count = 0;
		}else{
			count++;
		}
		
	}
	System.out.println("count is "+ count );
	
	}

}
