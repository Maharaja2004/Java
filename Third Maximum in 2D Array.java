import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[][]={ {1,2,3},
		              {4,5,6},
		              {7,8,9}
		            };
		 /* Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the Row:");
		  int row=sc.nextInt();
		  System.out.println();
    	  System.out.print("Enter the Column:");
		  int col=sc.nextInt();
		 int arr[][]=new int[row][col];    
		 
		 for(int i=0;i<arr.length;i++){
		     for(int j=0;j<arr[i].length;j++){
		         arr[i][j]=sc.nextInt();
		     }
		 }*/
		 for(int i=0;i<arr.length;i++){
		     for(int j=0;j<arr[i].length;j++){
		         System.out.print(arr[i][j]+" ");
		     }
		     System.out.println();
		 }
		 int max1=arr[0][0];
		 int max2=arr[0][0];
		 int max3=arr[0][0];
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[i].length;j++){
		        if(max1<arr[i][j]){
		            max3=max2;
		            max2=max1;
		            max1=arr[i][j];
		        }
		    }
		}
		System.out.print("The third Maximum is:"+max3);
	}
}
