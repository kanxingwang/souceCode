package kan.javase.demo;

public class Bird extends Animal implements Flyable{

	@Override
	public void eat() {
		System.out.println("eat bug");
		
	}

	@Override
	public void sleep() {
		System.out.println("123123");
	}

	@Override
	public void fly() {
		System.out.println("���ó���");
		
	}

}
