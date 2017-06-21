package Abstraction;

public abstract class AbstractClass {
	abstract void draw();
	AbstractClass(){
		System.out.println("i m constructor of Abstract Class");
	}
	void name(){
		System.out.println("i m a non abstract method in abstract class");
	}

}

class circle extends AbstractClass{
	void draw(){
		System.out.println("circle");
	}
}
class triangle extends AbstractClass{
	void draw(){
		System.out.println("triangle");
	}
}