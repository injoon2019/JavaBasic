class StringEquality{
	public static void main(String[] args){
		String str1 = new String("So Simple");
		String str2 = new String("So Simple");

		//참조 대상 비교
		if(str1 == str2)
			System.out.println("str1, str2 참조 대상 동일하다");
		else
			System.out.println("str1, str2 참조 대상 다르다");

		//두 인스턴스 내용 비교
		if(str1.equals(str2))
			System.out.println("str1, str2 내용 동일");
		else
			System.out.println("st1, str2 내용 다르다");
	}
}