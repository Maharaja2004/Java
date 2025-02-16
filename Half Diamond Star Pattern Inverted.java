
public class Main
{
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++){
		    for(int space=n;space>i;space--){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i=n-1;i>=1;i--){
		    for(int space=1;space<=n-i;space++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
o/p:
    *
   **
  ***
 ****
  ***
   **
    *
  
