package method;

public class ArthmaticOperation {
	static int[] result(int a,int b)
	{
		int[] c=new int[2];
		c[0]=(a+b);
		c[1]=(a-b);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c=result(120,40);
		System.out.println("Addition     : "+c[0]);
		System.out.println("Substraction : "+c[1]);
		

	}

}
