package Overriding;

public class Book {
	public void Author() {
		System.out.println("This Book Written By A");
	}
}

class Book1 extends Book {
	public void Author() {
		System.out.println("This Book Written By B");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 WTR=new Book1();
		WTR.Author();
	}

}
