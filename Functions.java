import java.util.Scanner;
class Calculator{
    Scanner sc=new Scanner(System.in);
    //no arg,no ret
    public void add(){
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter b value:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum="+c);
    }
    //no arg,ret
    public int diff(){
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter b value:");
        int b=sc.nextInt();
        int c=a-b;
        return c;
    }
    // arg, no ret
    public void pro(int a,int b){
        int c=a*b;
        System.out.println("Product="+c);
        
    }
    //arg,ret
    public int div(int a,int b){
        int c=a/b;
        return c;
    }
}
public class Main
{
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add();
		System.out.println("Difference="+obj.diff());
		obj.pro(4,5);
		System.out.println("Division="+obj.div(4,2));
	}
}
