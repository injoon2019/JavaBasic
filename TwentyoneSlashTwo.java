class Box<T>{
	private T ob;
	public void set(T o){ob =o;}
	public T get()	{return ob;}
}

class TwentyoneSlashTwo{
	//�� ��ġ��  swapBox �޼ҵ� ��������
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
		swapBox(box1, box2);		//�����ؾ��� swapBox�޼ҵ�
		System.out.println(box1.get() + " & " + box2.get());
	}
}