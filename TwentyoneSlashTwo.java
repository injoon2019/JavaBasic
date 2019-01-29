class Box<T>{
	private T ob;
	public void set(T o){ob =o;}
	public T get()	{return ob;}
}

class TwentyoneSlashTwo{
	//이 위치에  swapBox 메소드 정의하자
	public static <T extends Number> void swapBox(Box<T> a, Box<T> b)
	{
		T temp = a.get();
		a.set(b.get());
		b.set(temp);
	}
	public static void main(String[] args){
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);		//정의해야할 swapBox메소드
		System.out.println(box1.get() + " & " + box2.get());
	}
}