package test;

import java.util.List;

import dao.SmallcategoryDao;
import model.Small_category;

public class SMALL_CATEGORY_test {
	public static void main(String[] args) {
		SmallcategoryDao dao = new SmallcategoryDao();
	// select()のテスト
			System.out.println("---------- select()のテスト ----------");
			List<Small_category> cardList2 = dao.select(new Small_category( 1));
			for (Small_category card : cardList2) {
				System.out.println("ID：" + card.getID());
				System.out.println("SMALL_CATEGORY：" + card.getSMALL_CATEGORY());
				System.out.println("BIGCATEGORY_ID：" + card.getBIGCATEGORY_ID());

			}

}
}