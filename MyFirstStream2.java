import java.util.Arrays;

class MyFirstStream2{
	public static void main(String[] args){
		int[] ar = {1,2,3,4,5};
		
		int sum = Arrays.stream(ar)//스트림 생성
				.filter(n->n%2 ==1)	//filter 통과시키고
				.sum();
		System.out.println(sum);
	}
}