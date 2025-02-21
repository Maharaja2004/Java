import java.util.Scanner;

public class Main
{
    public int a,b,c;
    public void display(){
        System.out.println("Sum="+c);
    }
	public static void main(String[] args) {
	Main obj=new Main();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the a value:");
	obj.a=sc.nextInt();
	System.out.print("Enter the b value:");
	obj.b=sc.nextInt();
	obj.c=obj.a+obj.b;
	obj.display();
	}
}
