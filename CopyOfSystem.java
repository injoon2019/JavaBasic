class CopyOfSystem{
	public static void main(String[] args){
		double[] org = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] cpy = new double[3];

		//�迭 org�� �ε���1���� �迭 cpy�� �ε��� 0���� �� ���� ��� ����
		
		for(double d : cpy)
			System.out.print(d+"\t");
		System.out.println();
	}
}