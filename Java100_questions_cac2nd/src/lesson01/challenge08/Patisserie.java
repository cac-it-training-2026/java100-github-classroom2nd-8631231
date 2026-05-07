/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		System.out.println();

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		BufferedReader shitoron = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン　　　＞");
		String strs = shitoron.readLine();
		double nums = Double.parseDouble(strs);

		System.out.println("ショコラ　　　＞");
		String strsho = shitoron.readLine();
		double numsho = Double.parseDouble(strsho);

		System.out.println("ピスタージュ　＞");
		String strp = shitoron.readLine();
		double nump = Double.parseDouble(strp);

		System.out.println("シトロン      " + nums + "個");
		System.out.println("ショコラ      " + numsho + "個");
		System.out.println("ピスタージュ  " + nump + "個");

		double numg = nums + numsho + nump;

		System.out.println("合計個数" + numg + "個");

		double numsg = 250 * nums;
		double numshog = 280 * numsho;
		double numpg = 320 * nump;

		double numgk = numsg + numshog + numpg;
		int inumgk = (int) numgk;

		System.out.println("合計金額" + inumgk + "円");

		System.out.print("\nをお買い上げですね。\n承りました\n");

		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		//		int inums = (int) nums;
		//		int inumsho = (int) numsho;
		//		int inump = (int) nump;
		//この段階でintに直すと切り捨ててから引き算になる
		//計算してから引き算にするためにはdoubleの状態で計算して=の後に（int）をつけないといけない

		citronStock = (int) (citronStock - nums);
		chocolatStock = (int) (chocolatStock - numsho);
		pistacheStock = (int) (pistacheStock - nump);

		System.out.println();
		System.out.println("シトロン　　　　　\\" + 250 + "・・・残り" + +citronStock + "個");
		System.out.println("ショコラ　　　　　\\" + 280 + "・・・残り" + +chocolatStock + "個");
		System.out.println("ピスタージュ　　　\\" + 320 + "・・・残り" + pistacheStock + "個");

		System.out.print("\n閉店時間となりました。\nまたのお越しをお待ちしております。");

		System.out.println();
		System.out.println("売上の割合");
		System.out.println("売上合計　　　　　￥" + inumgk);
		System.out.println();

		System.out.println("内訳");

		int citronw = (int) (numsg / inumgk * 100);
		int chocolatw = (int) (numshog / numgk * 100);
		int pistachew = (int) (numpg / (int) numgk * 100);

		System.out.println("シトロン　　　　　\\" + (int) numsg + "・・・" + citronw + "%");
		System.out.println("ショコラ　　　　　\\" + (int) numshog + "・・・" + chocolatw + "%");
		System.out.println("ピスタージュ　　　\\" + (int) numpg + "・・・" + pistachew + "%");
	}

}
