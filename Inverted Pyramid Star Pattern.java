import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n=5;
		
	     for(int i=n;i>=1;i--){
	         for(int space=i;space<n;space++){
	             System.out.print(" ");
	         }
	         for(int j=1;j<=2*i-1;j++){
	             System.out.print("*");
	         }
	         System.out.println();
	     }
	     
	 }

}
