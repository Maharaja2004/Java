package basicprograms;

public class HexaDecimalAddition {

	  public static String hexadd(String a,String b) {
		  String result="";int carry=0;
		  while(a.length()<b.length()) {
			  a='0'+a;
		  }
		  while(a.length()>b.length()) {
			  b='0'+b;
		  }
		  //a="1A3" b="02F"
		  
		  int len=a.length()-1;
		  for(int i=len;i>=0;i--) {
			  int c=hexint(a.charAt(i));
			  int d=hexint(b.charAt(i));
			  
			  int sum=c+d+carry;
			  carry=sum/16;
			  result=inthex(sum%16)+result;
		  }
		  
		  if(carry>0) {
			  result=inthex(carry)+result;
		  }
		  return ("The Hexadecimal Addition of"+a +" and "+b+" is "+result);
	  }
	
	public static int hexint(char a) {
		 if (a >= '0' && a <= '9') {
	            return a - '0';
	        } 
		 else if (a >= 'A' && a <= 'F') {
	            return a - 'A' + 10;
	            
		 }
		 else if (a >= 'a' && a <= 'f') { // Fixed for lowercase
	            return a - 'a' + 10;
	        } 
		 else {
	            return 0; // Default case, should never happen
	        }
		
	}
	public static char inthex(int a) {
		if(a<10) {
			return (char)('0'+a);
		}
		else {
			return (char)('A'+(a-10));
		}
	}
	
	public static void main(String[] args) {
		String a = "1A3";  
		String b = "2F";
		System.out.print(hexadd(a,b));
	}

}
