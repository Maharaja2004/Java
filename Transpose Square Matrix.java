public class Main
{
	public static void main(String[] args) {
		int arr[][]= {{1,2},{3,4}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix:");
	
	int row=arr.length;
	int col=arr[0].length;
	int transpose[][]=new int[col][row];
	for(int i=0; i<col; i++) {
		for(int j=0; j<row; j++) {
			transpose[i][j]=arr[j][i];
		}
	}
	for(int i=0; i<transpose.length; i++) {
		for(int j=0;j<transpose.length;j++){
		    System.out.print(transpose[i][j]+" ");
		}
		System.out.println();
	}
	
	}


}
