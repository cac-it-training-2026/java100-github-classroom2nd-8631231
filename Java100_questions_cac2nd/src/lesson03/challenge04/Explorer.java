/**
 * 第3章 探検隊のお仕事
 *
 * 問題4  歩いて橋を渡る
 *
 * 進行方向に全長3mの吊り橋を発見しました。
 * 5人の隊員は一人50cmの歩幅で歩かなければならず
 * また吊り橋は老朽化しているため一人ずつしか渡れません。
 *
 * コメントの位置にwhile文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  吊り橋発見！
 *
 *  隊長：
 *  1人目が渡り始めたよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  2人目が渡り始めたよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  全員渡り終わったよ！
 *
 */

package lesson03.challenge04;

public class Explorer {

	public static void main(String[] args) {

		System.out.println("隊長：");
		System.out.println("吊り橋発見！\n");

		int fullLength = 300;
		int member = 1;
		int houkoku = (fullLength / 50);

		do {

			System.out.println("\n隊長\n" + member + "人目が渡り始めたよ。");

			for (int i = 0; i < houkoku; i++) {
				fullLength -= 50;
				//				member += 1;
				System.out.println("隊長\nまだ渡ってるよ");
			}
			member++;
		} while (member <= 6);

		System.out.println("\n全員渡り終わったよ！");

		//		System.out.println("");

	}

}
