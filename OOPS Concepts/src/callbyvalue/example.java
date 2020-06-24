package callbyvalue;

class add{
	static int x;
	static int y;

	add(int a,int b)
	{
		x=a;
		y=b;
	}
}
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add val=new add(10,5);
		change(val);

		System.out.println(val.x);
		System.out.println(val.y);
	}
	private static void change(add val) {
		// TODO Auto-generated method stub
		add.x++;
		add.y++;
	}
}




