package Overloading;

public class Example1 {
	void sub(int a,int b)
	{
		System.out.println("Substraction is : "+(a-b));
	}

	void sub(float a,float b)
	{
		System.out.println("Substraction is : "+(a-b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 exm1=new Example1();
		exm1.sub(4,2);
		exm1.sub(4.4f,2.2f);
	}
}
