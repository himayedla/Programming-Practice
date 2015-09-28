package inovvapath;

public class MergeArr {
	public static void main(String[] args){
		
		int a[] = {3,8,6,4,10};
        int b[] = {1,5, 7, 9};
        int c = 0;
        int res[] = new int[a.length + b.length];
        for(int i=0;i<(a.length + b.length); i++)
        {
            if(a.length > b.length)
            {
                if(i<a.length)
                    res[c++] = a[i];
                else if(c<=res.length-1)
                    res[c++] = a[i];

                if(i<b.length)
                res[c++] = (char) b[i];
            }else{
                if(i<b.length)
                    res[c++] = b[i];
                else if(c<=res.length-1)
                    res[c++] = b[i];

                if(i<a.length)
                res[c++] = (char) a[i];
            }

        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print("   "+res[i]);
        }
    }

}
	

