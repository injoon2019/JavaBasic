import java.time.Instant;
import java.time.Duration;

class InstantDemo{
	public static void main(String[] args){
		Instant start = Instant.now();	//���� �ð� ������ ����
		System.out.println("����: "+start.getEpochSecond());

		System.out.println("Time files like an arrow");

		Instant end = Instant.now();	//���� �ð� ������ ����
		System.out.println("��: "+end.getEpochSecond());

		Duration between = Duration.between(start, end);	//�� �ð��� �� ���
		System.out.println("�и� �� ���� ��: "+between.toMillis());
	}
}