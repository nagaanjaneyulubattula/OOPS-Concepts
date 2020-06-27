package Specila_Keywords;

public class this_keyword {
	String name;
	int age;

	this_keyword(String n,int a)
	{
		this.name=n;
		this.age=a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_keyword x=new this_keyword("Anji", 21);
		System.out.println("Name 	: "+x.name);
		System.out.println("Age 	: "+x.age);
	}

}
