package basicprograms;

public class BinaryAddition {

	 public static String binaryadd(String a,String b) {
		 String result="";int carry=0;
		 while(a.length()<b.length()) {
			 a='0'+a;
		 }
		 while(a.length()>b.length()) {
			 b='0'+b;
		 }
		 //a="1011"' b="1101"
		 int len=a.length()-1;
		 for(int i=len;i>=0;i--) {
			 int c=a.charAt(i)-'0';
			 int d=b.charAt(i)-'0';
			 
			 int sum=c+d+carry;
			 carry=sum/2;
			 result=(sum%2)+result;
		 }
		 if(carry>=1) {
			 result=carry+result;
		 }
		 
		 return("The Binary Addition of "+a+" and "+b+" is "+result);
	 }
	
	
	
	
	
	public static void main(String[] args) {
		String a = "1011";  
		String b = "1101";
        System.out.println(binaryadd(a,b));
	}

}
