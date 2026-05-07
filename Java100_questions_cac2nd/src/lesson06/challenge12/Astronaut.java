/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {

	private String item;

	/**
	 * @return item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item セットする item
	 */
	public void setItem(String item) {

		int lastIndex = item.length() - 1;//最後の文字をとる
		char lastch = item.charAt(lastIndex);//char=文字1文字の型charに１文字を入れてる
		//char 変数 = 文字列.charAt(インデックス);型
		String changeString = changeLastChar(lastch);

		if (changeString != null) {//もし値が入っていれば
			StringBuffer sb = new StringBuffer(item);
			//item（元の文字列）を StringBuffer に変換している
			sb.replace(lastIndex, lastIndex + 1, changeString);
			//lastIndex の位置からlastIndex + 1 の手前までつまり1文字分をchangeString に置き換えます。
			this.item = new String(sb);
			//変更後の文字列を String に戻して、フィールド item に代入しています。
		} else {
			this.item = item;
		}

	}

	private String changeLastChar(char ch) {
		String changeString = null;
		switch (ch) {
		case '0':
			changeString = "zero";
			break;
		case '1':
			changeString = "one";
			break;
		case '2':
			changeString = "two";
			break;
		case '3':
			changeString = "three";
			break;
		case '4':
			changeString = "four";
			break;
		case '5':
			changeString = "five";
			break;
		case '6':
			changeString = "six";
			break;
		case '7':
			changeString = "seven";
			break;
		case '8':
			changeString = "eight";
			break;
		case '9':
			changeString = "nine";
			break;

		default:
			break;
		}
		return changeString;
		//			throw new IllegalArgumentException("Unexpected value: " + ch);
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);//setterに入力された言葉を送る

		String item = null;

		//ここに適切な処理を記述する
		item = omegalian.getItem();//getterから戻った言葉をitemに入れる

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
