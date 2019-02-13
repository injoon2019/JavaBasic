class FallThroughWarnings{
	@SuppressWarnings("fallthrough")
	public static void main(String[] args){
		int n=3;
		
		switch(n){
		case1:
			System.out.println(n);
		case2:
			System.out.println(n);
		case3:
			System.out.println(n);
		}
	}
}
