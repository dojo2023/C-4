package test;

import java.util.List;

import dao.WeatherDao;
import model.Weather;

public class WEATHER_test {
	// select()のテスト
	public static void main(String[] args) {
		WeatherDao dao = new WeatherDao();
				System.out.println("---------- select()のテスト ----------");
				List<Weather> cardList2 = dao.select(new Weather( 1));
				for (Weather card : cardList2) {
					System.out.println("ID：" + card.getID());
					System.out.println("DAY_WEATHERCODE：" + card.getDAY_WEATHERCODE());
					System.out.println("WEATHER_IMAGE：" + card.getWEATHER_IMAGE());
					System.out.println("WEATHER_EXPRESSION：" + card.getWEATHER_EXPRESSION());

				}

	}
}
