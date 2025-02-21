class A{
    private int a=5;
    private int b=5;
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
}
class B extends A{
    int c;
    public void display(){
        c=get_a()+get_b();
        System.out.println(c);
    }
}
public class Main
{
	public static void main(String[] args) {
		B obj=new B();
		obj.display();
	}
}
