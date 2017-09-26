package kan.javase.practice;

public class CompareNums {
	/**
	 * 比较数字
	 * @param first
	 * @param second
	 * @return max
	 */
	public static int  compare(int first,int second){
		int result=first;
		if(first<second){
			result=second;
		}
		return result;
	}

}
