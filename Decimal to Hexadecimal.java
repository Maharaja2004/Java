package basicprograms;

import java.util.Scanner;

public class DecimaltoHexa {

	
	public static String hexa(int n) {
		String s="";int num=n;
		if(n==0) {
			s=s+'0';
		}
		while(n>0) {
			int rem=n%16;
			if(rem<10) {
				s=(char)('0'+rem)+s;
			}
			else {
				s=(char)('A'+(rem-10))+s;
			}
			n=n/16;
		}
		return("The HexaDecimal of the "+num+" is "+s);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
		System.out.println(hexa(n));

	}

}
