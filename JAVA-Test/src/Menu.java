import java.util.Scanner;

public class Menu {
	int type;
	String name;
	int price;
	String sub;

	void read(Scanner scan) {
		type = scan.nextInt();
		name = scan.next();
		price = scan.nextInt();
		sub = scan.next();

	}

	void print() {
		if (type == 1)
			System.out.printf(" ���� %s %d��\n", name, price);
		else if (type == 2)
			System.out.printf(" ���� %s %d��\n", name, price);
		else
			System.out.printf(" ���� %s %d��\n", name, price);
	}
	boolean matches(String kwd) {
		if (kwd.matches("[0-9]+")) {
			int year = Integer.parseInt(kwd);
				return true;
		}
		return false;
	}

}
