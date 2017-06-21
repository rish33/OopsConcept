package functionOverriding;

 class ReferenceOfBaseClass {
	
	static int a = 5;
	int  b = 6;
	void run(){
		System.out.println(a + "  " + b);
		System.out.println("I m in Class Ref");
	}

}
class A extends ReferenceOfBaseClass{
//	 void run(){
//		System.out.println("I m in Class A");
//	}
//	public static void main(String[] args){
//		A obj=new A();
//		obj.run();
//	}
	//static int a = 7;
	int b=8;
	void run(){
		System.out.println(a + "  " + b);
		//System.out.println("I m in Class Ref");
	}
}

public class TestOverride{
	
	public static void main(String[] args) {
		
		A obj=new A();
		obj.run();
		
		System.out.println(obj.b);
		System.out.println(obj.a);
	}
}

