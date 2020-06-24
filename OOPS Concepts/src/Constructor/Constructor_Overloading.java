package Constructor;

class students {

	String name;
	String section;
	int age;

	students(){ //default constructor.
		name="";
		section="";
		age=0;
	}
	students(String n,String s,int a) //constructor overloaded
	{
		name=n;
		section=s;
		age=a;
	}
	public String toString()
	{
		return "this is " + name + " of "+section+" and my age is : "+age;
	}
}

public class Constructor_Overloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students s1=new students();
		students s2=new students("anji","java_section",21);
		s1.name="chaithu";
		s1.section="c++ section";
		s1.age=21;

		System.out.println("student 1 detailes : \n"+s1);
		System.out.println("=================");
		System.out.println("student 2 detailes : \n"+s2);
	}

}
