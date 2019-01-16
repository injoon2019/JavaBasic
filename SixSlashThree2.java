class SixSlashThree2{
	public static void main(String[] args){
		binary(7);		
	}

	public static void binary(int n)
	{
		if(n==0)
		{
			//System.out.println(0);
			return;
		}
		binary(n/2);
		System.out.println(n%2);
		//binary(n/2);
	}
}
		
