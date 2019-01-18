interface Printable{
	public void print(String doc);
}

class Printer implements Printable{	//Printable�� �����ϴ� Printer Ŭ����
	@Override
	public void print(String doc){
		System.out.println(doc);
	}
}

class PrintableInterface{
	public static void main(String[] args){
		Printable prn= new Printer(); //Printable�� �������� ���� ����
		prn.print("Hello Java");
	}
}
	