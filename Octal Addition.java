package basicprograms;

public class OctalAdditon {

	public static String stringconversiona(int a) {
		 String A="";
		 while(a>0) {
			int rem=a%8;
			A=(char)('0'+rem)+A;            
			a=a/8;
		 }
		 
		 return A;
	}
	
	public static String stringconversionb(int b) {
	String B="";
	while(b>0) {
		 int rem=b%8;
		 B=(char)('0'+rem)+B;
		 b=b/8;
	 }
	 return B;
	}
	
	public static String octaladd(String aa,String bb) {
		int carry=0;
		String result="";
		
		while(aa.length()<bb.length()) {
			aa='0'+aa;
		}
		while(aa.length()>bb.length()) {
			bb='0'+bb;
		}
	   //aa="0657" b="0324"
		int alen=aa.length()-1;
		int blen=bb.length()-1;
		for(int i=alen;i>=0;i--) {
			int c=aa.charAt(i)-'0';
			int d=bb.charAt(i)-'0';
			
			int sum=c+d+carry;
			carry=sum/8;
			result=(sum%8)+result;
			
		}
		if(carry>=1) {
			result=carry+result;
		}
		
		return ("The Octal Addition of " +aa + " and "+bb+ " is " + result);
	}
	
	public static void main(String[] args) {
		int a = 0657; 
		int b = 0324;
        String aa=stringconversiona(a);
        String bb=stringconversionb(b);
        System.out.println(octaladd(aa,bb));
	}

}
