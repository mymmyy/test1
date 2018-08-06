package huiwen;

//01��������
public class Pack01 {
	
	/**
	 * 
	 * @param w ��������
	 * @param p ��ֵ����
	 * @param weight ��������
	 * @param n ��Ʒ����
	 * @return
	 * @see https://www.cnblogs.com/TaoChiangBlog/p/6833328.html?utm_source=itdadao&utm_medium=referral
	 */
	public static int getMaxweight(int[] w, int[] p, int weight, int n){
        int[][] value = new int[n+1][weight+1];
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=weight;j++){
                //����ƷΪi������Ϊjʱ�������i��������(w[i-1])С������jʱ��c[i][j]Ϊ�����������֮һ��
                //(1)��Ʒi�����뱳���У�����c[i][j]Ϊc[i-1][j]��ֵ
                //(2)��Ʒi���뱳���У��򱳰�ʣ������Ϊj-w[i-1],����c[i][j]Ϊc[i-1][j-w[i-1]]��ֵ���ϵ�ǰ��Ʒi�ļ�ֵ
                if(w[i-1]<=j){
                    value[i][j]=Math.max(value[i-1][j], value[i-1][j-w[i-1]]+p[i-1]);
                     
                }
            }
        }
        return value[n][weight];
    }
	
	public static void main(String[] args) {
        int weight = 10;
        int n = 3;
        int[] w = {3,4,5};
        int[] p = {4,5,6};
        System.out.println(getMaxweight(w, p, weight, n));
    }

}
