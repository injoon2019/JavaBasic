class Car{
	int gasolineGauge;
	public Car(int oil){
		gasolineGauge =oil;
	}
}

class HybridCar extends Car{
	int electricGauge;
	public HybridCar(int oil, int ele){
		super(oil);
		electricGauge = ele;
	}
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	public HybridWaterCar(int oil, int ele, int wat){
		super(oil,ele);
		waterGauge = wat;
	}

	public void showCurrentGauge(){
		System.out.println("�ܿ� ���ָ�: "+gasolineGauge);
		System.out.println("�ܿ� ���ⷮ: "+electricGauge);
		System.out.println("�ܿ� ���ͷ�: "+waterGauge);
	}
}

class FourteenSalshOne{
	public static void main(String[] args){
		HybridWaterCar hwc=new HybridWaterCar(3,4,5);
		hwc.showCurrentGauge();
	}
}