import java.util.function.Consumer;

class ConsumerDemo{
	public static void main(String[] args){
		Consumer<String> c =  s->System.out.println(s);
		c.accept("Pineapple");	//출력 결과
		c.accept("Strawberry");
	}
}