/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題9 Stringクラス①（equals）
 *
 * 宇宙船が最初の目的地α星に到着しました。
 * α星は不思議な星です。この星を訪れる人は、
 * 無作為に抽出された10人のα星人のうち、
 * 1人でも名前を言い当てることができれば、
 * 星に降り立つことができ、名前を言い当てられなければ
 * 降り立つことができません。
 * α星人の名前はA～Eのアルファベット大文字1字のみです。
 *
 * α星人クラスAlphalianを新たに作成してください。
 * Alphalianの名前はA～Eのうちからランダムに決定されます。
 * 実行例と同じメッセージを表示しください。
 *
 * <実行例1>
 *
 * 名前を入れてください（A～E）＞○
 *
 * α星人：1人目
 * おら、そんな名前じゃないアルファ！
 * 【ランダムに決定した名前】が正解だアルファ！
 *
 * 名前を入れてください（A～E）＞○
 *
 * α星人：2人目
 * おら、そんな名前じゃないアルファ！
 * 【ランダムに決定した名前】が正解だアルファ！
 *
 * 名前を入れてください（A～E）＞○
 *
 * α星人：3人目
 * 当たったアルファ。α星にようこそアルファ。
 *
 * <実行例2>
 *
 * 名前を入れてください（A～E）＞○
 *
 * α星人：10人目
 * おら、そんな名前じゃないアルファ！
 * 【ランダムに決定した名前】が正解だアルファ！
 *
 * って言うか、お前やる気ないアルファ！
 * とっとと出て行けアルファ！
 *
 */

package lesson06.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにAlphalianクラスを記述する
class Alphalian {

	private String name;

	public Alphalian() {
		String[] name = { "A", "B", "C", "D", "E" };

		int nameNum = (int) (Math.random() * 10) % 5;//添数の中に入れる乱数
		this.name = name[nameNum];
		//privateのnameのなかに乱数で決定されるname を入れていく
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		boolean hitFlag = false;

		//ここに適切な処理を記述する。

		for (int i = 0; i < 10; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("名前を入れてください（A～E）＞");
			String estimatedName = br.readLine();

			System.out.println("\nα星人：" + (i + 1) + "人目");
			Alphalian alphalian = new Alphalian();//オブジェクト Alphalianの情報使用用
			String name = alphalian.getName();

			if (name.equals(estimatedName)) {//equalsはstringの比較
				hitFlag = true;
				break;//同じだったらtrueで終わり
			} else {
				System.out.println("おら、そんな名前じゃないアルファ！");
				System.out.println(name + "が正解だアルファ！\n");
			}

		}

		if (hitFlag) {
			System.out.println("当たったアルファ。α星にようこそアルファ。");
		} else {
			System.out.println("って言うか、お前やる気ないアルファ！");
			System.out.println("とっとと出て行けアルファ！");
		}
	}

}
