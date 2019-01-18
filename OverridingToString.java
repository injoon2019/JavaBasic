class Cake{
	//object 클래스의 toString 메소드를 override
	public String toString(){
		//Object 클래스의 toString 메소드 호출하여 반환 결과 출력
		return "My birthday cake";
	}
}

class CheeseCake extends Cake{
	//cake 클래스의 toString 메소도 override
	public String toString(){
		return "My birthday cheese cake";
	}
}

class OverridingToString{
	public static void main(String[] args){
		Cake c1 = new Cake();
		Cake c2 = new CheeseCake();

		//c1이 참조하는 인스턴스의 toString 메소드 호출
		System.out.println(c1);
		System.out.println();

		//c2가 참조하는 인스턴스의 toString 메소드 호출로 이어짐
		System.out.println(c2);
	}
}