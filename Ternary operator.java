public class Main
{
	public static void main(String[] args) {
      int a=100,b=200,c=300;
      int max=(a>b)?a:b;
    
    //NESTED TERNARY
      int maxi=(a>b&&a>c)?a:(b>c)?b:c;
    
    
    System.out.println(max);
    System.out.println(maxi);
	}
}
