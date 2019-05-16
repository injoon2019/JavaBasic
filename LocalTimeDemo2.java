import java.time.LocalTime;
import java.time.Duration;

class LocalTimeDemo2{
	public static void main(String[] args){
		//pc방의 pc이용 시작 시각
		LocalTime start = LocalTime.of(14,24,35);
		System.out.println("PC 이용 시작 시각: "+start);

		//PC방의 PC이용 종료 시각
		LocalTime end = LocalTime.of(17,31,19);	
		System.out.println("PC 이용 종료 시각: "+end);

		//PC이용 시간 계산
		Duration between =  Duration.between(start, end);
		System.out.println("총 PC 이용 시간: "+between);
	}
}