package sec01.ex1;

public class Ex002 {

	public static void main(String[] args) {
		
		boolean stop = true;
		if (stop) {
			System.out.println("정지");
		}
		
		float f1 = 5.1234f;
		System.out.println(f1);
		
		double d1 = 5e-2;
		System.out.println(d1);
		
		String str = "우리는 \"개발자\" 입니다.";
		System.out.println(str);
		
		char c1 = '\uac01';
		System.out.println(c1);
		
		int x1 = 10;
		int x2 = 010;
		int x3 = 0x10;
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		if (true) {
			int v1 = 100;
			System.out.println(v1);
		}
	}

}
