package test;

import java.util.List;

import dao.DailyDao;
import model.Day;

public class Daily_test {
	public static void main(String[] args) {
		DailyDao dao = new DailyDao();
		//String search = "2023-06-22";
		String search = "2023-06-22";
		Day day = new Day();
		day.setDAY_DAY(search);
		day.setUSER_ID("fujisawa");

		// selectsearch()のテスト
		System.out.println("---------- select()のテスト ----------");
		List<Day> cardList = dao.selectsearch(day);
		for (Day card : cardList) {
			System.out.println("ID：" + card.getID());
			System.out.println("DAY_DAY：" + card.getDAY_DAY());


	    }
	}
}
