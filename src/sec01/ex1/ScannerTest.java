package sec01.ex1;

import java.util.Scanner;

public class ScannerTest {

	public static String name(int score) {
		String lank;
		switch (score/10) {
		case 10:
		case 9: 
			lank = "A";
			break;
		case 8:
			lank = "B";
			break;
		case 7:
			lank = "C";
			break;	
		default:
			lank = "F";
			break;
		}
		return lank;
	}
	
	public static void main(String[] args) {
		String name[];
		int score[];
		String grade[];
		int count;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 학생수 >");
		
		count = Integer.parseInt(sc.nextLine());
		name = new String[count];
		score = new int[count];
		grade = new String[count];
		
		for(int x = 0; x < count; x++) {
			System.out.printf("학생(%d) 이름:", x);
			name[x] = sc.nextLine();
			System.out.printf("학생(%d) 점수:", x);
			score[x] = Integer.parseInt(sc.nextLine());
			grade[x] = name(score[x]);
		}
		
		System.out.println("이름\t 점수\t 학점");
		for(int y = 0; y < count; y++) {
			System.out.printf("%s\t %d\t %s\n", name[y], score[y], grade[y]);
		}
		
		
		
		sc.close();
	}

}
