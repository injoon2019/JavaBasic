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
	public static <T> Box<T> makeBox(T o){	//제네릭 메소드의 정의
		Box<T> box = new Box<T>();	//상자를 생성하고
		box.set(o);	//전달된 인스턴스를 상자에 담아서
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
