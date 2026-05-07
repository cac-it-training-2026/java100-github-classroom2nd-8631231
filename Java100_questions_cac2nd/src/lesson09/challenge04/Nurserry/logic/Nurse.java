package lesson09.challenge04.Nurserry.logic;

import lesson09.challenge04.Nurserry.exception.CriticalConditionException;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//ここに適切な処理を記述
	public void takeTemperature(NurserySchoolChild child)
			throws CriticalConditionException {//例外が起こるかもの宣言
		if (child.getTemperature() >= 38) {
			System.out.println("\n" + child.getName() + "は重体です。");
			throw new CriticalConditionException();//例外発生を表す処理終了
		} else {
			System.out.println("\n" + child.getName() + "の体温は"
					+ child.getTemperature() + "度です。");
		}
	}

}
