class Cake{
	//object Ŭ������ toString �޼ҵ带 override
	public String toString(){
		//Object Ŭ������ toString �޼ҵ� ȣ���Ͽ� ��ȯ ��� ���
		return "My birthday cake";
	}
}

class CheeseCake extends Cake{
	//cake Ŭ������ toString �޼ҵ� override
	public String toString(){
		return "My birthday cheese cake";
	}
}

class OverridingToString{
	public static void main(String[] args){
		Cake c1 = new Cake();
		Cake c2 = new CheeseCake();

		//c1�� �����ϴ� �ν��Ͻ��� toString �޼ҵ� ȣ��
		System.out.println(c1);
		System.out.println();

		//c2�� �����ϴ� �ν��Ͻ��� toString �޼ҵ� ȣ��� �̾���
		System.out.println(c2);
	}
}