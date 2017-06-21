package Inheritance;

public class Multilevel {
	void run(){System.out.println("running...");}  
}  

class Car2 extends Multilevel{  
void stop(){System.out.println("stopping...");}  
}  

class Bike2 extends Car2{
	void accelerate(){
		System.out.println("accelerating");
	}
}
