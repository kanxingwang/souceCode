package kan;

public class CompareNums {
	/**
	 * �Ƚ��������ֵĴ�С 
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
