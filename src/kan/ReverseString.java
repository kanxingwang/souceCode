package kan;



public class ReverseString {
	public static String reverString(String str) {
		char a []=str.toCharArray();
		String revString="";
		System.out.println(a.length);
		for (int i = a.length-1; i >=0; i--) {
			System.out.println("revString"+revString);
			revString+=a[i];
			System.out.println("revString"+revString);
		}
		return revString;
	}
	/*public static void main(String[] args) {
		System.out.println(reverString("kanxingwagn"));
	}*/
}
