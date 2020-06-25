package Inheritance;

public class Multilevel_Inheritance {
	String name;
	char section;
	int age;
}

class college extends Multilevel_Inheritance {

	String collegename;
}

class detailes extends college{

	void display() {
		System.out.println("name 			: "+name);
		System.out.println("section 		: "+section);
		System.out.println("age 			: "+age);
		System.out.println("collegename 		: "+collegename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		detailes student1=new detailes();

		student1.name="Anji";
		student1.section='A';
		student1.age=21;
		student1.collegename="Giet";

		student1.display();
	}

}
