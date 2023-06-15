package test;

import java.util.List;

import dao.PtempertureDao;
import model.Ptemperture;


public class PTEMPERTURE_test {
	public static void main(String[] args) {
		PtempertureDao dao = new PtempertureDao();
	// select()のテスト
	System.out.println("---------- select()のテスト ----------");
	List<Ptemperture> cardList2 = dao.select(new Ptemperture( 1));
	for (Ptemperture card : cardList2) {
		System.out.println("ID：" + card.getID());
		System.out.println("USER_PTEMPERTURE：" + card.getUSER_PTEMPERTURE());
		System.out.println("PTEM_MAXPTEM：" + card.getPTEM_MAXPTEM());
		System.out.println("PTEM_MINPTEM:"+ card.getPTEM_MINPTEM());
	}
	}
}
