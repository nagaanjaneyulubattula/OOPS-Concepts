package ObjectsandClasses;
public class StudentDetailes {
String name;
int roll_num;
int age;

void display() {
	System.out.println("Name     : "+name);
	System.out.println("roll_num : "+roll_num);
	System.out.println("age      : "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetailes student1=new StudentDetailes();
		StudentDetailes student2=new StudentDetailes();
		
		student1.name="Anji";
		student1.roll_num=204;
		student1.age=21;
		
		student2.name="chaithu";
		student2.roll_num=208;
		student2.age=21;
		
		student1.display();
		System.out.println("====================");
		student2.display();
		
	}

}
