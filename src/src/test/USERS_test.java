package test;
import java.util.List;

import dao.UsersDao;
import model.User;

public class USERS_test {
	public static void main(String[] args) {
		UsersDao dao = new UsersDao();

		// select()のテスト
		System.out.println("---------- select()のテスト ----------");
		List<User> cardList2 = dao.select(new User( 1));
		for (User card : cardList2) {
			System.out.println("ID：" + card.getID());
			System.out.println("USER_ID：" + card.getUSER_ID());
			System.out.println("USER_PW：" + card.getUSER_PW());
			System.out.println("USER_HOMEID:"+ card.getUSER_HOMEID());
			System.out.println("USER_GENDERID:"+ card.getUSER_GENDERID());
			System.out.println("USER_PTEMPERTUREID:"+ card.getUSER_PTEMPERTUREID());

		}

		// insert()のテスト
		System.out.println("---------- insert()のテスト ----------");
		User insRec = new User("matukura","seplus",23,1,2);
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
		User upRec = new User(3,"ishidou","seplus2016",35,2,-1 );
		if (dao.update(upRec)) {
			System.out.println("更新成功！");
			List<User> cardList4 = dao.select(upRec);
			for (User profile : cardList4) {
				System.out.println("ID：" + profile.getID());
				System.out.println("USER_ID：" + profile.getUSER_ID());
				System.out.println("USER_PW：" + profile.getUSER_PW());
				System.out.println("USER_HOMEID:"+ profile.getUSER_HOMEID());
				System.out.println("USER_GENDERID:"+ profile.getUSER_GENDERID());
				System.out.println("USER_PTEMPERTURE:"+ profile.getUSER_PTEMPERTUREID());

			}
		}
		else {
			System.out.println("更新失敗！");
		}
}
}