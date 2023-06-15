/**
 *
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Weather;

/**
 * @author user
 *
 */
public class WeatherDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す
				public List<Weather> select(Weather param) {
					Connection conn = null;
					List<Weather> cardList = new ArrayList<Weather>();

					try {
						// JDBCドライバを読み込む
						Class.forName("org.h2.Driver");

						// データベースに接続する
						conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

						// SQL文を準備する
						String sql = "select ID, DAY_WEATHERCODE,WEATHER_IMAGE,WEATHER_EXPRESSION from WEATHER WHERE ID =? ORDER BY ID";
						PreparedStatement pStmt = conn.prepareStatement(sql);

						// SQL文を完成させる
						if (param.getID() != 0) {
							pStmt.setInt(1, param.getID());
						}









						// SQL文を実行し、結果表を取得する
						ResultSet rs = pStmt.executeQuery();

						// 結果表をコレクションにコピーする
						while (rs.next()) {
							Weather card = new Weather(
							rs.getInt("ID"),
							rs.getInt("DAY_WEATHERCODE"),
							rs.getString("WEATHER_IMAGE"),
							rs.getString("WEATHER_EXPRESSION")
							);
							cardList.add(card);
						}
					}
					catch (SQLException e) {
						e.printStackTrace();
						cardList = null;
					}
					catch (ClassNotFoundException e) {
						e.printStackTrace();
						cardList = null;
					}
					finally {
						// データベースを切断
						if (conn != null) {
							try {
								conn.close();
							}
							catch (SQLException e) {
								e.printStackTrace();
								cardList = null;
							}
						}
					}

					// 結果を返す
					return cardList;
				}


}

