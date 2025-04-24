package basicprograms;

import java.util.Scanner;

public class DecimaltoOctal {

	public static String octal(int n) {
		int num=n;
		String s="";
		if(n==0) {
			s=s+'0';
		}
		while(num>0) {
			int rem=num%8;
			s=(char)('0'+rem)+s;
			num=num/8;
		}
		return("The Octal value of "+n+" is "+s);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
		System.out.println(octal(n));
	}

}
