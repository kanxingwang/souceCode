package kan.javase.demo;
/**
 * �Ͷ���һ����
 * @author Administrator
 *
 */
public class Play {
	
	 public static void  play(Animal animal) {
		 animal.eat();
		 animal.sleep();
	}
	
	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat=new Cat();
		play(dog);
		play(cat);
		
	}

}
