class Area{
    
    static int area(int a){
        int square=a*a;
        return square;
    }
    static int area(int l,int b){
        int rectangle=l*b;
        return rectangle;
    }
    static float area(float r){
        float circle=3.14f*(r*r);
        return circle;
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Area of Square="+Area.area(4));
		System.out.println("Area of Rectangle="+Area.area(4,3));
		System.out.println("Area of Circle="+Area.area(4.0f));
	}
}








