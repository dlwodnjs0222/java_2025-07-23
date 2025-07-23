package sec01.ex1;

public class Ex003 {

	public static void main(String[] args) {
		String s1 = "100";
		int i3 = Integer.parseInt(s1);
		System.out.println(i3 + 9);
		
		int x2 = 5;
		int y2 = 2;
		double z =  x2/(double) y2;
		System.out.println(z);
		
		float d1 = 1.5f + 100;
		System.out.println(d1);
		
		int x1 = 44032;
		char c1 = (char) x1;
		System.out.println(c1);
		
		int x;
		long y = 1000000000;
		x = (int) y;
		System.out.println(x);
	}

}
