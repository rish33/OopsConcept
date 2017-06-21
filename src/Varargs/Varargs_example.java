package Varargs;

public class Varargs_example {
	static void display(int x,String... values){
		System.out.println("I m in display1");
	}
	//there can be only 1 vararg arguement in a method
	static void display(int x,int... values){
		System.out.println("I m in display2");
	}
	public static void main(String[] args){
		display(5,6,7);
		display(5,"abc","def");
	}

}

