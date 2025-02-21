class Leftangle {

	void leftpat() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class Rightangle {

	void rigpat() {
		int n=5;
		for(int i=1; i<=n; i++) {
		    for(int sp=n-i;sp>=1;sp--){
		        System.out.print(" ");
		    }
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class Main
{
	public static void main(String[] args) {
		Leftangle lft=new Leftangle();
		Rightangle rht=new Rightangle();
		lft.leftpat();
	System.out.println();
		rht.rigpat();
	}
}
