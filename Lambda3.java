interface Printable{	//�߻� �޼ҵ尡 �ϳ��� �������̽�
	void print(String s);
}

class Lambda3{
	public static void main(String[] args){
		Printable prn = (s) ->{System.out.println(s);};
		prn.print("What is Lambda?");
	}
}