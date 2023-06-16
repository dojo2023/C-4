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

import model.Day;

public class DailyDao {

	// 引数paramで検索項目を指定し、検索結果のリストを返す
			public List<Day> select(Day param) {
				Connection conn = null;
				List<Day> cardList = new ArrayList<Day>();

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

					// SQL文を準備する
					String sql = "select ID,DAY_DAY,USER_ID,DAY_HTEMPERTURE,DAY_LTEMPERTUREDAY_TOPSNO,DAY_OUTERNO, DAY_BOTTOMNO from DAILY WHERE ID=? ORDER BY ID";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
					if (param.getID() != 0) {
						pStmt.setInt(1,  param.getID());
					}









					// SQL文を実行し、結果表を取得する
					ResultSet rs = pStmt.executeQuery();

					// 結果表をコレクションにコピーする
					while (rs.next()) {
						Day card = new Day(
						rs.getInt("ID"),
						rs.getString("DAY_DAY"),
						rs.getString("USER_ID"),
						rs.getDouble("DAY_HTEMPERTURE"),
						rs.getDouble("DAY_LTEMPERTURE"),
						rs.getInt("DAY_TOPSNO"),
						rs.getInt("DAY_OUTERNO"),
						rs.getInt("DAY_BOTTOMNO")
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



			// 引数profileで指定されたレコードを更新し、成功したらtrueを返す
			public boolean update(Day day) {
				Connection conn = null;
				boolean result = false;

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

					// SQL文を準備する
					String sql = "update DAILY set DAY_TOPSNO=?,DAY_OUTERNO=?,DAY_BOTTOMNO=?  where ID=? ";
	//
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
					if (day.getDAY_TOPSNO() != 0 ) {
						pStmt.setInt(1, day.getDAY_TOPSNO());
					}
					else {
						pStmt.setString(1, null);
					}
					if (day.getDAY_OUTERNO() != 0) {
						pStmt.setInt(2, day.getDAY_OUTERNO());
					}
					else {
						pStmt.setString(2, null);
					}
					if (day.getDAY_BOTTOMNO() != 0 ) {
						pStmt.setInt(3, day.getDAY_BOTTOMNO());
					}
					else {
						pStmt.setString(3, null);
					}



					pStmt.setInt(4, day.getID());

					// SQL文を実行する
					if (pStmt.executeUpdate() == 1) {
						result = true;
					}
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				finally {
					// データベースを切断
					if (conn != null) {
						try {
							conn.close();
						}
						catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}

				// 結果を返す
				return result;
			}



			public boolean insert(Day day) {
				Connection conn = null;
				boolean result = false;

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");
		/*?の数*/
					// SQL文を準備する
					String sql = "insert into DAILY (ID,DAY_DAY,USER_ID,DAY_HTEMPERTURE,DAY_LTEMPERTURE,DAY_TOPSNO,DAY_OUTERNO,DAY_BOTTOMNO ) values ( ?, ?,?,?,?,?,?,?)";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
				/*	if (card.getNumber() != 0 ) {
						pStmt.setInt(1, card.getNumber());
					}
					else {
						pStmt.setInt(1, 0);
					}*/
					if (day.getID() != 0) {
						pStmt.setInt(1, day.getID());
					}
					else {
						pStmt.setString(1, null);
					}
					if (day.getDAY_DAY() != null && !day.getDAY_DAY().equals("")) {
						pStmt.setString(2, day.getDAY_DAY());
					}
					else {
						pStmt.setString(2, null);
					}
					if (day.getUSER_ID != null && !day.getDAY_DAY().equals("")) {
						pStmt.setString(3, day.getUSER_ID());
					}
					else {
						pStmt.setInt(3, 0);
					}
					if (profile.getUSER_GENDERID() != 0 ) {
						pStmt.setInt(4, profile.getUSER_GENDERID());
					}
					else {
						pStmt.setInt(4, 0);
					}
					if (profile.getUSER_PTEMPERTUREID() != 0 ) {
						pStmt.setInt(5, profile.getUSER_PTEMPERTUREID());
					}
					else {
						pStmt.setInt(5, 0);
					}


					// SQL文を実行する
					if (pStmt.executeUpdate() == 1) {
						result = true;
					}
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				finally {
					// データベースを切断
					if (conn != null) {
						try {
							conn.close();
						}
						catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}

				// 結果を返す
				return result;
			}



}
