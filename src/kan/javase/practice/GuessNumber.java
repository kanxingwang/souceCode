package kan.javase.practice;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 * @author Administrator
 *
 */
public class GuessNumber {
	public static final String  RIGHT="恭喜 对了";
	public static final String  BIG="大了";
	public static final String  SMALL="小了";
	
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
			System.out.println("请输入要猜测的数字");
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			int guess=scanner.nextInt();
			guessString=guess(guess, answer);
			System.out.println(guessString);	
			
		} while (!guessString.endsWith(RIGHT));
		
		
	}

}
