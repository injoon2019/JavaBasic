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
		//이전 예제 MutualAccess.java 와 동일하므로 생략합니다
	}
}