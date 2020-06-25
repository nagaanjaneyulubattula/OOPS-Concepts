package Aggregation;

class Author
{
	String authorname;
	int age;
	String place;
	
	Author(String name,int age,String place){
		this.authorname=name;
		this.age=age;
		this.place=place;
	}
}

public class Book {
	
	String name;
	int price;
	
	Author auther;
	Book(String n,int p,Author auther){
		this.name=n;
		this.price=p;
		this.auther=auther;
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author auther = new Author("J. R. R. Tolkien", 83, "USA");
	    Book b = new Book("The Hobbit", 599, auther);
	    System.out.println("Book Name	: "+b.name);
	    System.out.println("Book Price	: "+b.price);
	    System.out.println("------------Auther Details----------");
	    System.out.println("Auther Name	: "+b.auther.authorname);
	    System.out.println("Auther Age	: "+b.auther.age);
	    System.out.println("Auther place	: "+b.auther.place);
	}

}
