public class Main
{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("1 ");
			}
			System.out.println();

		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int a=1;
		for(int i=1;i<=5;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(a);
		        a++;
		    }
		    System.out.println();
		}
			System.out.println();
		for(int i=1;i<=5;i++){
		    for(int j=5-i;j>=1;j--){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++){
		        System.out.print("*");
		    }
		   System.out.println();
		}
		
		
		System.out.println();
		int n=5;
		for(int i=1;i<n;i++){
		    for(int sp=n-1;sp>i;sp--){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i*2-1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
			System.out.println();
	   
		for(int i=1;i<n;i++){
		    for(int sp=n-1;sp>=i;sp--){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}




