public class Main
{
	public static void main(String[] args) {
		int arr[][]= { {5,4,7},
			{1,8,3},
			{9,6,2}
		};
		int s[]=new int[9];
		int x=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				s[x]=arr[i][j];
				x++;
			}
		}
		
		for(int i=0;i<s.length;i++){
		    for(int j=i+1;j<s.length;j++){
		        if(s[i]>s[j]){
		            int temp=s[i];
		            s[i]=s[j];
		            s[j]=temp;
		        }
		    }
		}
		
		
		for(int k=0; k<s.length; k++) {
			System.out.print(s[k]+" ");
		}
		
		int y=0;
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[i].length;j++){
		        arr[i][j]=s[y];
		        y++;
		    }
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
		    for(int k=0; k<arr[i].length; k++) {
			System.out.print(arr[i][k]+" ");
		}
		System.out.println();
		}
	}
}
