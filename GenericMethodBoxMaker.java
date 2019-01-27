class Box<T>{
	private T ob;
	
	public void set(T o){
		ob=o;
	}
	public T get(){
		return ob;
	}
}
class BoxFactory{
	public static <T> Box<T> makeBox(T o){	//���׸� �޼ҵ��� ����
		Box<T> box = new Box<T>();	//���ڸ� �����ϰ�
		box.set(o);	//���޵� �ν��Ͻ��� ���ڿ� ��Ƽ�
		return box;
	}
}

class GenericMethodBoxMaker{
	public static void main(String[] args){
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		System.out.println(sBox.get());

		Box<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
	}
}
