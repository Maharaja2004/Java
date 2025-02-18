
public class Main
{
	public static void main(String[] args) {
		int arr[]= {2,7,5,7};
		int tar=12;
		for(int i=0; i<arr.length; i++) {

			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==tar) {
					System.out.print(i+" ");
					System.out.print(j+" ");
				}

			}
			System.out.println();
		}
	}
}
