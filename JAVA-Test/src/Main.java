import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main a = new Main();
		a.mymain();
	}

	Menu menuList[] = null;
	int count = 0;
	Menu orderList[] = null;
	int Ocount = 0;

	void mymain() {
		readMenu();
		printMenu();
		search();
	}

	void readMenu() {
		Scanner filein = openFile("menu.txt");
		filein.nextLine();
		menuList = new Menu[50];
		while (filein.hasNext()) {
			menuList[count] = new Menu();
			menuList[count].read(filein);
			count++;
		}
		filein.close();
	}

	void printMenu() {
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]", i + 1);
			menuList[i].print();
		}
	}

	Scanner scan = new Scanner(System.in);

	void search() {
		int kwd;
		int op=0;
		int subsum=0;
		while (true) {
			int sum = 0;
			System.out.printf("%d번째 주문 : ",op+1);
			op = scan.nextInt();
			if (op==0)
			{
				System.out.printf("총합계: %d",subsum);
				break;
			}
			while (true) {
				kwd = scan.nextInt();
				for (int i = 0; i < count; i++) {
					if ((kwd) == i + 1) {
						System.out.printf("[%d]", kwd);
						menuList[i].print();
						sum += menuList[i].price;
					}
				}
				if (kwd == 0)
					break;
			}
			System.out.printf("합계:%d \n", sum);
			subsum+=sum;
		}
	}

	Scanner openFile(String filename) {
		File f = new File(filename);
		Scanner s = null;
		try {
			s = new Scanner(f);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		return s;
	}

}
