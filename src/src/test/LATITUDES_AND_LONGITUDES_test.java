package test;

import java.util.List;

import dao.Latitude_and_longitudeDao;
import model.Latitudes_and_longitudes;

public class LATITUDES_AND_LONGITUDES_test {
	public static void main(String[] args) {
		Latitude_and_longitudeDao dao = new Latitude_and_longitudeDao();
	// select()のテスト
	System.out.println("---------- select()のテスト ----------");
	List<Latitudes_and_longitudes> cardList2 = dao.select(new Latitudes_and_longitudes( 1));
	for (Latitudes_and_longitudes card : cardList2) {
		System.out.println("ID：" + card.getID());
		System.out.println("HOME：" + card.getHOME());
		System.out.println("LATITUDE：" + card.getLATITUDE());
		System.out.println("LONGITUDE:"+ card.getLONGITUDE());
	}
	}
}
