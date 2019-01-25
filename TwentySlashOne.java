import java.util.Scanner;
import java.util.Random;


class TwentySlashOne{
	public static void main(String[] args){
		Scanner keyboard =new Scanner(System.in);
		int A = keyboard.nextInt();
		int Z = keyboard.nextInt();
		int min,max;
		if(A>Z){
			min=Z;
			max=A;
		}
		else{
			min=A;
			max = Z;
		}		
	
		Random rand = new Random();
		int rn;
		for(int i=0; i<10; i++){
			rn = min;
			rn += rand.nextInt(max-min+1);
			System.out.println(rn);
		}
	}
}