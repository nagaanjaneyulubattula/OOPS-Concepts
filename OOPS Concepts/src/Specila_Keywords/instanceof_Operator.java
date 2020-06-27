package Specila_Keywords;

public class instanceof_Operator { }

	class Child1 extends instanceof_Operator{}

	class Child2 extends instanceof_Operator{}

	class Demo
	{
	  public static void main(String[] args)
	  {
		  instanceof_Operator p =new instanceof_Operator();
	      Child1 c1 = new Child1();
	      Child2 c2 = new Child2();

	      System.out.println(c1 instanceof instanceof_Operator);         //true
	      System.out.println(c2 instanceof instanceof_Operator);         //true
	      System.out.println(p instanceof Child1);          //false
	      System.out.println(p instanceof Child2);          //false

	      p = c1;
	      System.out.println(p instanceof Child1);          //true
	      System.out.println(p instanceof Child2);          //false

	      p = c2;
	      System.out.println(p instanceof Child1);          //false
	      System.out.println(p instanceof Child2);          //true

	   }

	}