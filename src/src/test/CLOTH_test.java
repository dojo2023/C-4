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
		System.out.println("CLO_IMAGES:"+ card.getCLO_IMAGES());
	}

	// insert()のテスト
	System.out.println("---------- insert()のテスト ----------");
	Cloth insRec = new Cloth("matukura",6,"リンク2");
	if (dao.insert(insRec)) {
		System.out.println("登録成功！");
		/*User profile = dao.select();
		System.out.println("ID：" + profile.getID());
		System.out.println("USER_ID：" + profile.getUSER_ID());
		System.out.println("USER_PW：" + profile.getUSER_PW());
		System.out.println("USER_HOMEID:"+ profile.getUSER_HOMEID());
		System.out.println("USER_GENDERID:"+ profile.getUSER_GENDERID());
		System.out.println("USER_PTEMPERTUREID:"+ profile.getUSER_PTEMPERTUREID());
*/
	}
	else {
		System.out.println("登録失敗！");
	}

	// update()のテスト
	System.out.println("---------- update()のテスト ----------");
	Cloth upRec = new Cloth(3,"ishidou",18,"リンク1");
	if (dao.update(upRec)) {
	System.out.println("更新成功！");
	List<Cloth> cardList4 = dao.select(upRec);
	for (Cloth profile : cardList4) {
		System.out.println("ID：" + profile.getID());
		System.out.println("USER_ID：" + profile.getUSER_ID());
		System.out.println("SMALL_CATEGORYID：" + profile.getSMALL_CATEGORYID());
		System.out.println("CLO_IMAGES:"+ profile.getCLO_IMAGES());
		}
	} else {
			System.out.println("更新失敗！");
	}

	// delete()のテスト
	System.out.println("---------- delete()のテスト ----------");
	if (dao.delete(2)) {
		System.out.println("削除成功！");
	} else {
		System.out.println("削除失敗！");
	}


}
}
