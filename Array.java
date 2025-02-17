import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i:arr){
		    System.out.print(i+" ");
		}
		System.out.println();
		for(int i:arr){
		    i++;
		    System.out.print(i);
		}
			System.out.println();
		for(int i=0;i<arr.length;i++){
		    arr[i]++;
		    System.out.print(arr[i]);
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
