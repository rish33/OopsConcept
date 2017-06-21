package Abstraction;

 class ClassUsingInterface implements InterfaceClass,InterfaceClass_multiple_inheritance {
 public void run(){
	 System.out.println("running");
 }

@Override
public void sleep() {
	// TODO Auto-generated method stub
	System.out.println("I m supporting multiple inheritance");
	
}
}
 
 class Person implements InterfaceClass{
	 public void sleep(){
		 System.out.println("person sleeping");
	 }
	 public void run(){
		 System.out.println("person running");
	 }
 }
