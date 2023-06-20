package test;

import dao.GenderDao;
import model.Gender;

public class GENDER_test {
	public static void main(String[] args) {
		GenderDao dao = new GenderDao();
	// select()のテスト
			System.out.println("---------- select()のテスト ----------");
			Gender cardList2 = dao.select( 1);
				System.out.println("ID：" + cardList2.getID());
				System.out.println("GENDER_CATEGORY：" + cardList2.getGENDER_CATEGORY());


}
}
