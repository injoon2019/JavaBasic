interface Printable{
	void print();
}

class Papers{
	private String con;
	public Papers(String s){con =s;}
	
	public Printable getPrinter(){
		class Printer implements Printable{	//���� Ŭ������ ����
			public void print(){
				System.out.println(con);
			}
		}

		return new Printer();	//���� Ŭ������ �ν��Ͻ� ���� �� ��ȯ
	}
}

class UseLocalInner{
	public static void main(String[] args){
		Papers p = new Papers("���� ����: �ູ�մϴ�.");
		Printable prn = p.getPrinter();
		prn.print();
	}
}