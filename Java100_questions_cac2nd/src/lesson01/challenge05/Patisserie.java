/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		BufferedReader shitoron = new BufferedReader(new InputStreamReader(System.in));

		String strs = shitoron.readLine();
		String strsho = shitoron.readLine();
		String strp = shitoron.readLine();

		int nums = Integer.parseInt(strs);
		int numsho = Integer.parseInt(strsho);
		int nump = Integer.parseInt(strp);

		System.out.println("シトロン      " + nums + "個");
		System.out.println("ショコラ      " + numsho + "個");
		System.out.println("ピスタージュ  " + nump + "個");

		int numg = nums + numsho + nump;

		System.out.println("合計個数" + numg + "個");

		int numsg = 250 * nums;
		int numshog = 280 * numsho;
		int numpg = 320 * nump;

		int numgk = numsg + numshog + numpg;

		System.out.println("合計金額" + numgk + "円");

		System.out.print("をお買い上げですね。\n承りました");

	}
}
