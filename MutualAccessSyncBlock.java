class Counter{
	int count = 0;
	public void increment(){
		synchronized(this){
			count++;
		}
	}
	public void decrement(){
		synchronized(this){
			count--;
		}
	}
	public int getCount(){return count;}
}

class MutualAccessSyncBlock{
	public static Counter cnt = new Counter();

	public static void main(String[] args) throws InterruptedException{
		//���� ���� MutualAccess.java �� �����ϹǷ� �����մϴ�
	}
}