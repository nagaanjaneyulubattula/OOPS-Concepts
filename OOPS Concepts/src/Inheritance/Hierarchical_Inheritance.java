package Inheritance;

public class Hierarchical_Inheritance {
	String name;
	char section;
	int age;

	void display()
	{
		System.out.println("name 			: "+name);
		System.out.println("section 		: "+section);
		System.out.println("age 			: "+age);

	}
}

class male extends Hierarchical_Inheritance{

	String gender="male";
}

class female extends Hierarchical_Inheritance{

	String gender="female";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		male student1=new male();
		female student2=new female();

		student1.name="Anji";
		student1.section='A';
		student1.age=21;

		student2.name="Chaitra";
		student2.section='A';
		student2.age=21;

		student1.display();
		System.out.println("Gender 			:"+student1.gender);

		System.out.println("==============================");
		student2.display();
		System.out.println("Gender 			:"+student2.gender);

	}
}
