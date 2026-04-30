package lesson7challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		String[] yamanoteStations = { "東京", "神田", "秋葉原", "御徒町",
				"上野", "鶯谷", "日暮里", "西日暮里", "田端", "駒込", "巣鴨",
				"大塚", "池袋", "目白", "高田馬場", "新大久保", "新宿", "代々木",
				"原宿", "渋谷", "恵比寿", "目黒", "五反田", "大崎", "品川",
				"高輪ゲートウェイ", "田町", "浜松町", "新橋", "有楽町" };

		boolean[] stationFlag = new boolean[yamanoteStations.length];
		//山手線の駅数と同じ分の「true / false を入れる配列」booleanはtrue,false専用配列型

		Arrays.fill(stationFlag, true);
		//arrays.fill(配列,値)=配列の中身を全部同じ値で埋めるためのメソッド

		System.out.println("「※※※ 山手線ゲーム ※※※」");
		System.out.println("「      ゲームスタート！    」");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Random rand = new Random();//ランダムに選ぶための箱を生成

		boolean hitFlag = false;//これを正解したらtrueに変える

		int gameCount = 0;//ゲームの実行回数カウント

		do {//駅名の入力を必ず行いそれ以下を分岐、繰り返し
			String inputStationName = br.readLine();//駅名を入力

			for (int i = 0; i < yamanoteStations.length; i++) {//駅の数分だけ繰り返し

				if (yamanoteStations[i].equals(inputStationName)) {
					//.equals=文字列やオブジェクトの「中身が同じかどうか」を比較するためのメソッド
					//入力したものと山手線の駅が一致しているかを確認
					if (stationFlag[i]) {
						//ここで1から30の駅と照会

						hitFlag = true;//同じものがあったら

						stationFlag[i] = false;//faiseに変えて使用済みに

						break;
					} else {

						break;
					}
				}
			}

			gameCount++;//1回

			if (!hitFlag || (gameCount == yamanoteStations.length)) {
				//もし山手線以外または30を超えた場合

				break;//おしまい

			}

			hitFlag = false;//cpu用に一旦クリア

			while (!hitFlag) {
				int num = rand.nextInt(stationFlag.length);
				//上限30で乱数を獲得

				if (stationFlag[num]) {
					System.out.println(yamanoteStations[num]);

					stationFlag[num] = false;//使用済みチェック

					hitFlag = true;
				}
			}

			gameCount++;

			hitFlag = false;

		} while (gameCount != stationFlag.length);//30に達したらやめる

		if (gameCount == yamanoteStations.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");

		}
	}
}
