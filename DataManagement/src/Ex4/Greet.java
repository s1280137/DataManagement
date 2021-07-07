package Ex4;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    System.out.println("あなたの名前は何ですか？");
    Scanner scan = new Scanner(System.in);
	String name = scan.next();
    System.out.println("こんにちは、" + name + "!");
	}
}
