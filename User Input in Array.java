import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[5];
		System.out.println("Enter the integer array:");
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println();
		double arr2[]=new double[5];
		System.out.println("Enter the double array:");
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=sc.nextDouble();
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println();
		float arr3[]=new float[5];
		System.out.println("Enter the float array:");
		for(int i=0; i<arr3.length; i++) {
			arr3[i]=sc.nextFloat();
		}
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Enter the char array:");
		char arr4[]=sc.next().toCharArray();
		
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i]+" ");
		}
	}
}
