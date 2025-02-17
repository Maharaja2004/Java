public class Main
{
	public static void main(String[] args){
		int arr[]={1,2,3,4,7,5};
		int max1=arr[0];
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>max1){
		    max1=arr[i];
		    }
		}
		System.out.print(max1);
		
	}
}
