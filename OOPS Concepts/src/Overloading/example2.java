package Overloading;

public class example2 {

	void sub(int a,int b)
	{
		System.out.println("Substraction is : "+(a-b));
	}

	void sub(int a,int b,int c)
	{
		System.out.println("Substraction is : "+(a-b-c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example2 exm2=new example2();
		exm2.sub(4,2);
		exm2.sub(4,2,1);
	}
}