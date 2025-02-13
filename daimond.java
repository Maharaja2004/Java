public class Main
{
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int spa=n-i; spa>=1; spa--) {
				System.out.print(" ");
			}
			for(int j=1; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<n; i++) {
			for(int space=1; space<=i; space++) {
				System.out.print(" ");
			}
			for(int k=n-1; k>i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
