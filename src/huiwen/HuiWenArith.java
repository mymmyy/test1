package huiwen;

public class HuiWenArith {

	/**是否是回文数字*/
	public static boolean isPalindromic(int num) {
		
		int temp = num;
		int reverseNum = 0;
		while(temp != 0) {
			reverseNum = reverseNum * 10 +temp % 10;
			temp /= 10;
		}
		return reverseNum == num;
	}
	
	public static void main(String[] args) {
		boolean palindromic = isPalindromic(11211211);
		System.out.println(palindromic);
	}
	
}
