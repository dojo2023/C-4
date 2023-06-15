package test;

import java.util.List;

import dao.BigcategoryDao;
import model.Big_category;

public class bigcategory_test {
	public static void main(String[] args) {
		BigcategoryDao dao = new BigcategoryDao();
	// select()のテスト
			System.out.println("---------- select()のテスト ----------");
			List<Big_category> cardList2 = dao.select(new Big_category( 1));
			for (Big_category card : cardList2) {
				System.out.println("ID：" + card.getID());
				System.out.println("BIG_CATEGORY：" + card.getBIG_CATEGORY());
			}
	}

}
