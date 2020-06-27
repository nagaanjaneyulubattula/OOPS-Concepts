package Specila_Keywords;

public class Static_Keyword {
	String name;
	int roll;
	static String college="GIET"; //static keyword

	public void display() {
		System.out.println("My name is "+name +" and roll is "+roll+" and Studying in "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Keyword std1=new Static_Keyword();
		Static_Keyword std2=new Static_Keyword();
		Static_Keyword std3=new Static_Keyword();

		std1.name="Anji";
		std1.roll=204;

		std2.name="Chaithu";
		std2.roll=208;

		std3.name="Mahesh";
		std3.roll=233;

		std1.display();
		System.out.println("============================");
		std2.display();
		System.out.println("============================");
		std3.display();
	}

}
