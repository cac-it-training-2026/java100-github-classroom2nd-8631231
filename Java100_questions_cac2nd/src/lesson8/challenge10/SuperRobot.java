package lesson8.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {

	String makeEggDishes(int meetNum, int onionNum, int eggNum,
			int pannkoNum, int soltNum, int pepperNum, int nutmegNum) {
		String ryouri = null;

		if (meetNum >= 200 && onionNum >= 100 && eggNum >= 1 && pannkoNum >= 20 &&
				soltNum >= 5 && pepperNum >= 5 && nutmegNum >= 5) {
			ryouri = "ハンバーグ";
		} else {
			ryouri = null;
		}
		return ryouri;
	}

}

public class SuperRobot {
	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("もうちょっと高度な調理機能が欲しいですね。\n");
		System.out.println("G博士：");
		System.out.println("では材料の分量に応じて作るメニューを変える機能を入れてみようかの。\n");
		System.out.println("Rさん：");
		System.out.println("そんなことが出来るんですか！\n");
		System.out.println("G博士：");
		System.out.println("出来るとも。ひき肉200g、玉ねぎ100g、卵1個、パン粉20g、塩5g、胡椒5g、ナツメグ5gがそろえばハンバーグを作る。\n");
		System.out.println("G博士：");
		System.out.println("それ以外の場合は何も作らないようにするんじゃ。\n");
		System.out.println("Rさん：");
		System.out.println("それは凄そうですね。完成をお待ちしています。\n");
		System.out.println("G博士：");
		System.out.println("......出来たぞ！早速動かしてみよう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ひき肉の量を入力してください（グラム）＞");
		String meetNumstr = br.readLine();
		int meetNum = Integer.parseInt(meetNumstr);

		System.out.print("\n玉ねぎの量を入力してください（グラム）＞");
		String onionNumstr = br.readLine();
		int onionNum = Integer.parseInt(onionNumstr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nパン粉の量を入力してください（グラム）＞");
		String pannkoNumstr = br.readLine();
		int pannkoNum = Integer.parseInt(pannkoNumstr);

		System.out.print("\n塩の量を入力してください（グラム）＞");
		String soltNumstr = br.readLine();
		int soltNum = Integer.parseInt(soltNumstr);

		System.out.print("\n胡椒の量を入力してください（グラム）＞");
		String pepperNumstr = br.readLine();
		int pepperNum = Integer.parseInt(pepperNumstr);

		System.out.print("\nナツメグの量を入力してください（グラム）＞");
		String nutmegNumstr = br.readLine();
		int nutmegNum = Integer.parseInt(nutmegNumstr);

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//makeEggDishesを実行する。
		//標準出力でメニューを表示する。
		Robot robot = new Robot();//インスタンス
		String ryouri = robot.makeEggDishes(meetNum, onionNum, eggNum, pannkoNum, soltNum, pepperNum, nutmegNum);
		//string ryouriにmakeEggDishes(略) {の結果を入れている
		if (ryouri != null) {
			System.out.println(ryouri + "が出来ました。");
		} else {
			System.out.println("何も作れませんでした。");
		}

	}

}
