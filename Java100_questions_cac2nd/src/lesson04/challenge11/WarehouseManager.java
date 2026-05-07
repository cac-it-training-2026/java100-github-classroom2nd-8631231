/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

import java.util.Random;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		int[] Cbox = new int[5];
		int[] Dbox = new int[5];
		int[] Ebox = new int[5];
		int[][] boxAll = new int[5][5];

		//Random rand = new Random();
		Random randC = new Random();
		Random randD = new Random();
		Random randE = new Random();

		boxAll[0] = Cbox;
		boxAll[1] = Dbox;
		boxAll[2] = Ebox;

		boolean loopStopFlg = false;

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		for (int i = 0; i < 5; i++) {
			if (randC.nextInt(4) == 0) {
				Cbox[i] = 0;
			} else {
				Cbox[i] = randC.nextInt(10);
			}
		}

		for (int j = 0; j < 5; j++) {
			if (randD.nextInt(4) == 0) {
				Dbox[j] = 0;
			} else {
				Dbox[j] = randD.nextInt(10);
			}
		}

		for (int k = 0; k < 5; k++) {
			if (randE.nextInt(4) == 0) {
				Ebox[k] = 0;
			} else {
				Ebox[k] = randE.nextInt(10);
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。

		for (int i = 0; i < Cbox.length; i++) {
			System.out.print(Cbox[i]);
			if (i != (Cbox.length - 1)) {
				System.out.print(",");
			}
		}

		//ここに配列Dの要素をすべて出力する処理を記述する。
		System.out.print("\n\nD...");

		for (int j = 0; j < Dbox.length; j++) {
			System.out.print(Dbox[j]);
			if (j != (Dbox.length - 1)) {
				System.out.print(",");
			}
		}

		//ここに配列Eの要素をすべて出力する処理を記述する。
		System.out.print("\n\nE...");

		for (int k = 0; k < Ebox.length; k++) {
			System.out.print(Ebox[k]);
			if (k != (Ebox.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する
		int[] box = new int[15];//一度３つの配列の値を一つにまとめる
		for (int i = 0; i < box.length; i++) {
			box[i] = -1;
		}
		//boxAll[]はA・B・Cの配列の配列boxAll[0]=Abox[]
		int k = 0;
		for (int i = 0; i < boxAll.length; i++) {
			for (int j = 0; j < boxAll[0].length; j++) {
				if (boxAll[i][j] == 0) {
					continue;
				} else {
					box[k] = boxAll[i][j];
					boxAll[i][j] = 0;
					k++;

				}
			}
		}
		k = 0;

		for (int i = 0; i < boxAll.length; i++) {
			for (int j = 0; j < boxAll.length; j++) {
				boxAll[i][j] = box[k];
				k++;
				if (box[k] == -1) {
					loopStopFlg = true;
					break;
				}
			}
			if (loopStopFlg) {
				break;
			}
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < Cbox.length; i++) {
			System.out.print(Cbox[i]);
			if (i != (Cbox.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int j = 0; j < Dbox.length; j++) {
			System.out.print(Dbox[j]);
			if (j != (Dbox.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < Ebox.length; i++) {
			System.out.print(Ebox[i]);
			if (i != (Ebox.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
