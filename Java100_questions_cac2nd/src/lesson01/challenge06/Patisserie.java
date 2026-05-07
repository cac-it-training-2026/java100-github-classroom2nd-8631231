/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("大変お待たせいたしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("本日のおすすめ商品です。");
		System.out.println();

		System.out.println("シトロン　　　　　\\" + 250);
		System.out.println("ショコラ　　　　　\\" + 280);
		System.out.println("ピスタージュ　　　\\" + 320);

		BufferedReader shitoron = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");
		System.out.println("シトロン　　　＞");
		String strs = shitoron.readLine();
		int nums = Integer.parseInt(strs);

		System.out.println("ショコラ　　　＞");
		String strsho = shitoron.readLine();
		int numsho = Integer.parseInt(strsho);

		System.out.println("ピスタージュ　＞");
		String strp = shitoron.readLine();
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

		System.out.print("をお買い上げですね。\n承りました\n");

		int numsn = 30 - nums;
		int numshon = 30 - numsho;
		int numpn = 30 - nump;

		System.out.println();
		System.out.println("シトロン　　　　　\\" + 250 + "・・・残り" + numsn + "個");
		System.out.println("ショコラ　　　　　\\" + 280 + "・・・残り" + numshon + "個");
		System.out.println("ピスタージュ　　　\\" + 320 + "・・・残り" + numpn + "個");

	}

}
