package Ex4;

import java.util.Random;

public class Dicegame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     Random random = new Random();
     int randomValue1 = random.nextInt(6);
     int randomValue2 = random.nextInt(6);
     int sum = randomValue1 + randomValue2;

     System.out.println("サイコロを振ると...");
     System.out.println("サイコロ1：" + randomValue1);
     System.out.println("サイコロ2：" + randomValue2);
     System.out.println("合計値:" + sum);

     if(sum > 7) {
    	 System.out.println("You won");
    } else {
    	 System.out.println("You lost");
        }
	}
}
