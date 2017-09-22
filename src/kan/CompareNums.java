package kan;

public class CompareNums {
	/**
	 * 比较两个数字的大小 
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
