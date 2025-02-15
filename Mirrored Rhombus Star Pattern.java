
public class Main
{
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++){
		    for(int space=n-1;space>=i;space--){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=n;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
o/p:
      ****
     ****
   ****
  ****
