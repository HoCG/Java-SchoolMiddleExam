
public class bbb {
	public static void main(String[] args) {
		int num=201611871;
		double code=( (num % 10000) * 3897 + (num / 100000)*(num / 100000) ) % 10000;
		System.out.println(code);
	}

}
