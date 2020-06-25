package Inheritance;

public class Single_inherit {
	String name;
	char section;
	int age;
}
class student1 extends Single_inherit {
	void display()
	{
		System.out.println("name 	: "+name);
		System.out.println("section : "+section);
		System.out.println("age 	: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 std1=new student1();

std1.name="Anji";
std1.section='A';
std1.age=21;

std1.display();
	}

}
