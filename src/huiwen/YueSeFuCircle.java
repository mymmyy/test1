package huiwen;


/**约瑟夫环 : 约瑟夫环问题 （ 最简单的数学解法）:https://www.cnblogs.com/cmmdc/p/7216726.html*/
public class YueSeFuCircle {

	static int yuesefu(int n, int value){
	    int s = 0;
	    for (int i = 2; i <= n; i++){
	        s = (s + value) % i;
//	        System.out.println(s);
	    }
	    return s+1;
	}
	
	public static void main(String[] args) {
		int yuesefu = yuesefu(10,7);
		System.out.println("The winner is :" + yuesefu);
	}
}
