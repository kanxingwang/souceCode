package kan.javase.practice;

import java.util.Random;
import java.util.Scanner;

/**
 * ϵͳ�������1-100���������������֣����ݵõ�����ʾ�²���
 * @author Administrator
 *
 */
public class GuessNumber {
	public static final String  RIGHT="��ϲ�㣬����ˣ�";
	public static final String  BIG="���ˣ�";
	public static final String  SMALL="С�ˣ�";
	
	public static int generateResult(){
		Random random =new Random();
		return random.nextInt(10);
	}
	
	public static String guess(int guess,int answer){
		if(guess==answer){
			return RIGHT;
		}else if(guess<answer){
			return SMALL;
		}else {
			return BIG;
		}
	}
	
	public static void main(String[] args) {
		String guessString;
		int answer=generateResult();
		do {
			System.out.println("������Ҫ�²�����֣�");
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			int guess=scanner.nextInt();
			guessString=guess(guess, answer);
			System.out.println(guessString);	
			
		} while (!guessString.endsWith(RIGHT));
		
		
	}

}
