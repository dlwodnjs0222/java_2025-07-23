package sec01.ex1;

import java.util.Scanner;

public class ArrayTeat {

	public static void main(String[] args) {
		
		int score[];
		int sum = 0;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력할 점수의 개수:");
		int count = Integer.parseInt(scan.nextLine());
		score = new int[count];
		for (int i=0; i < score.length; i++) {
			System.out.printf("%d 점수>", i);
			score[i] = Integer.parseInt(scan.nextLine());
			sum += score[i];
		}
		avg = sum / (double) score.length;
		System.out.printf("총점: %d, 평균: %.3f\n", sum, avg);
		
		scan.close();
	}

}
