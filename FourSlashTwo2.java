class FourSlashTwo2{
	public static void main(String[] args){
		int num1=15678;
		int num2 = num1 >>3;
		num2 %=2;
		int num3 = num1 >>5;
		num3 %=2;
		System.out.println(num2);
		System.out.println(num3);
	}
}