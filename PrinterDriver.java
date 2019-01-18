interface Printable{ //MS�� �����ϰ� ������ �������̽�
	public void print(String doc);
}
	
class SPrinterDriver implements Printable{	//S�簡 ������ Ŭ����
	@Override
	public void print(String doc){
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable{	//L�簡 ������ Ŭ����
	@Override
	public void print(String doc){
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

class PrinterDriver{
	public static void main(String[] args){
		String myDoc = "This is a report about...";
	
		//�Ｚ
		Printable prn= new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
			
		//LG
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
}
