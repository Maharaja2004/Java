class Book{
    String title;
    double prize;
    Book(){
        title="Java Programming";
        prize=100.0;
        System.out.println("Book Title: "+title);
        System.out.println("Book Prize: "+prize);
    }
}
public class Main
{
	public static void main(String[] args) {
		Book obj=new Book();
	}
}
