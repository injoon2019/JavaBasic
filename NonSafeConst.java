interface Animal{
	int DOG=1;
	int CAT=2;
}
interface Person{
	int MAN=1;
	int WOMAN=2;
}

class NonSafeConst{
	public static void main(String[] args){
		who(Person.MAN);	//�������� �޼ҵ� ȣ��
		who(Animal.DOG);	//�������� �޼ҵ� ȣ��
	}

	public static void who(int man){
		switch(man){
		case Person.MAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		case Person.WOMAN:
			System.out.println("���� �մ��Դϴ�.");
			break;
		}
	}
}