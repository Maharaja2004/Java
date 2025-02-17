public class Main
{
	public static void main(String[] args) {
		int a[]= {1,1,0,1,1,0,0,0,1,1,1,1,0};
		int count=0;
		int prev=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				count++;
			}
			else {
				if(count>prev) {
					prev=count;
				}
				count=0;
			}
		}
		System.out.print(prev);
	}
}
