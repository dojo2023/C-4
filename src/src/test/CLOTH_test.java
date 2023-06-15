package test;

import java.util.List;

import dao.ClothesDao;
import model.Cloth;

public class CLOTH_test {
	public static void main(String[] args) {
		ClothesDao dao = new ClothesDao();

	// select()のテスト
	System.out.println("---------- select()のテスト ----------");
	List<Cloth> cardList2 = dao.select(new Cloth( 1));
	for (Cloth card : cardList2) {
		System.out.println("ID：" + card.getID());
		System.out.println("USER_ID：" + card.getUSER_ID());
		System.out.println("SMALL_CATEGORYID：" + card.getSMALL_CATEGORYID());
		System.out.println("USER_HOMEID:"+ card.getCLO_IMAGES());
	}

}
}
