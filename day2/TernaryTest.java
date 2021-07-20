class TernaryTest 
/*
ÈýÔªÔËËã·û
*/
{
	public static void main(String[] args) {
		/*
		int m = 12;
		int n = 10;
		*/
        int m = 12;
		int n = 15;

		//int max = (m > n)? m : n;

		String maxStr = (m > n)? "m" : ((m == n)? "same" : "n");

		System.out.println(maxStr);

		int n1 = 19;
		int n2 = 41;
		int n3 = 12;

		int max1 = (n1 > n2)? n1 : n2;
		int max2 = (max1 > n3)? max1 : n3;
        System.out.println("max :" + max2);
	}
}
