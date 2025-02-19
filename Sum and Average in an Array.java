
public class Main
{
	public static void main(String[] args) {
		int a[]={1,2,3,4};
		int sum=0;
		for(int i=0;i<a.length;i++){
		    sum=sum+a[i];
	}
	System.out.print(sum);
	int avg;
	avg=sum/a.length;
	System.out.print(avg);
}
}
