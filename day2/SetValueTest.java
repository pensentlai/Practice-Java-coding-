class SetValueTest 
{
	public static void main(String[] args) 
	{
	int i = 1;
		i *= 0.1;
		System.out.println(i);
		i++;
		System.out.println(i);

	
		int m = 2;
		int n = 3;
		n *= m++; 	
		System.out.println("m=" + m);
		System.out.println("n=" + n);
		
		
		int n1 = 10;
		n1 += (n1++) + (++n1);
		System.out.println(n1);
	}
}
