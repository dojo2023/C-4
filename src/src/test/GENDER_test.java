package test;

import java.util.List;

import dao.GenderDao;
import model.Gender;

public class GENDER_test {
	public static void main(String[] args) {
		GenderDao dao = new GenderDao();
	// select()のテスト
			System.out.println("---------- select()のテスト ----------");
			List<Gender> cardList2 = dao.select(new Gender( 1));
			for (Gender card : cardList2) {
				System.out.println("ID：" + card.getID());
				System.out.println("GENDER_CATEGORY：" + card.getGENDER_CATEGORY());

			}

}
}
