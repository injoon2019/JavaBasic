interface Printable{
	void print(String doc);
}

interface ColorPrintable extends Printable{  //Printable을 상속하는 인터페이스
	void printCMYK(String doc);
}

//S사의 컬러 프린터 드라이버
class Prn909Drv implements ColorPrintable{
	@Override
	public void print(String doc){
		System.out.println("From MD-909 black & white ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc){
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}

class PrinterDriver3{
	public static void main(String[] args){
		String myDoc = "This is a report about..";
		ColorPrintable prn = new Prn909Drv();
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	}
}