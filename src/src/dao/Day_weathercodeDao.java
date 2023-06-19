package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Day_weathercode;

public class Day_weathercodeDao {

	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Day_weathercode> select(int daily_id,String rowname ) {
		Connection conn = null;
		List<Day_weathercode> cardList = new ArrayList<Day_weathercode>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

			// SQL文を準備する
			String sql = "select ID,daily_ID,? from DAY_WEATHERCODE WHERE daily_ID=? ORDER BY ID";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (rowname != null) {
				pStmt.setString(1, rowname);
			}
			else {
				pStmt.setString(1, null);
			}
			if (daily_id != 0) {
				pStmt.setInt(2,daily_id );
			}
			else {
				pStmt.setString(2, null);
			}









			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Day_weathercode card = new Day_weathercode(
				rs.getInt("ID"),
			    daily_id,
			    rs.getDouble("rowname")
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


	public boolean insert(Day_weathercode profile) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");
/*?の数*/
			// SQL文を準備する
			String sql = "insert into DAY_WEATHERCODE (daily_ID ,weathercode_0, weathercode_1, weathercode_2, weathercode_3 ,weathercode_4, weathercode_5, weathercode_6 ,weathercode_7 ,weathercode_8, weathercode_9 ,weathercode_10, weathercode_11, weathercode_12, weathercode_13, weathercode_14, weathercode_15, weathercode_16, weathercode_17, weathercode_18, weathercode_19 ,weathercode_20 ,weathercode_21 ,weathercode_22, weathercode_23, temperture_0, tempertere_1, temperture_2 ,temperture_3, temperture_4, temperture_5 ,temperture_6 ,temperture_7 ,temperture_8, temperture_9 ,temperture_10 ,temperture_11, temperture_12, temperture_13, temperture_14, temperture_15 ,temperture_16, temperture_17, temperture_18, temperture_19, temperture_20 ,temperture_21 ,temperture_22, temperture_23 ) values ( ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
		/*	if (card.getNumber() != 0 ) {
				pStmt.setInt(1, card.getNumber());
			}
			else {
				pStmt.setInt(1, 0);
			}*/
			if (profile.getDaily_ID() != 0 ) {
				pStmt.setInt(1, profile.getDaily_ID());
			}
			else {
				pStmt.setString(1, null);
			}
			if (profile.getWeathercode_0() != 1000 ) {
				pStmt.setInt(2, profile.getWeathercode_0());
			}
			else {
				pStmt.setString(2, null);
			}
			if (profile.getWeathercode_1() != 1000 ) {
				pStmt.setInt(3, profile.getWeathercode_1());
			}
			else {
				pStmt.setString(3, null);
			}
			if (profile.getWeathercode_2() != 1000 ) {
				pStmt.setInt(4, profile.getWeathercode_2());
			}
			else {
				pStmt.setString(4, null);
			}
			if (profile.getWeathercode_3() != 1000 ) {
				pStmt.setInt(5, profile.getWeathercode_3());
			}
			else {
				pStmt.setString(5, null);
			}
			if (profile.getWeathercode_4() != 1000 ) {
				pStmt.setInt(6, profile.getWeathercode_4());
			}
			else {
				pStmt.setString(6, null);
			}
			if (profile.getWeathercode_5() != 1000 ) {
				pStmt.setInt(7, profile.getWeathercode_5());
			}
			else {
				pStmt.setString(7, null);
			}
			if (profile.getWeathercode_6() != 1000 ) {
				pStmt.setInt(8, profile.getWeathercode_6());
			}
			else {
				pStmt.setString(8, null);
			}
			if (profile.getWeathercode_7() != 1000 ) {
				pStmt.setInt(9, profile.getWeathercode_7());
			}
			else {
				pStmt.setString(9, null);
			}
			if (profile.getWeathercode_8() != 1000 ) {
				pStmt.setInt(10, profile.getWeathercode_8());
			}
			else {
				pStmt.setString(10, null);
			}
			if (profile.getWeathercode_9() != 1000 ) {
				pStmt.setInt(11, profile.getWeathercode_9());
			}
			else {
				pStmt.setString(11, null);
			}
			if (profile.getWeathercode_10() != 1000 ) {
				pStmt.setInt(12, profile.getWeathercode_10());
			}
			else {
				pStmt.setString(12, null);
			}
			if (profile.getWeathercode_11() != 1000 ) {
				pStmt.setInt(13, profile.getWeathercode_11());
			}
			else {
				pStmt.setString(13, null);
			}
			if (profile.getWeathercode_12() != 1000 ) {
				pStmt.setInt(14, profile.getWeathercode_12());
			}
			else {
				pStmt.setString(14, null);
			}
			if (profile.getWeathercode_13() != 1000 ) {
				pStmt.setInt(15, profile.getWeathercode_13());
			}
			else {
				pStmt.setString(15, null);
			}
			if (profile.getWeathercode_14() != 1000 ) {
				pStmt.setInt(16, profile.getWeathercode_14());
			}
			else {
				pStmt.setString(16, null);
			}
			if (profile.getWeathercode_15() != 1000 ) {
				pStmt.setInt(17, profile.getWeathercode_15());
			}
			else {
				pStmt.setString(17, null);
			}
			if (profile.getWeathercode_16() != 1000 ) {
				pStmt.setInt(18, profile.getWeathercode_16());
			}
			else {
				pStmt.setString(18, null);
			}
			if (profile.getWeathercode_17() != 1000 ) {
				pStmt.setInt(19, profile.getWeathercode_17());
			}
			else {
				pStmt.setString(19, null);
			}
			if (profile.getWeathercode_18() != 1000 ) {
				pStmt.setInt(20, profile.getWeathercode_18());
			}
			else {
				pStmt.setString(20, null);
			}
			if (profile.getWeathercode_19() != 1000 ) {
				pStmt.setInt(21, profile.getWeathercode_19());
			}
			else {
				pStmt.setString(21, null);
			}
			if (profile.getWeathercode_20() != 1000 ) {
				pStmt.setInt(22, profile.getWeathercode_20());
			}
			else {
				pStmt.setString(22, null);
			}
			if (profile.getWeathercode_21() != 1000 ) {
				pStmt.setInt(23, profile.getWeathercode_21());
			}
			else {
				pStmt.setString(23, null);
			}
			if (profile.getWeathercode_22() != 1000 ) {
				pStmt.setInt(24, profile.getWeathercode_22());
			}
			else {
				pStmt.setString(24, null);
			}
			if (profile.getWeathercode_23() != 1000 ) {
				pStmt.setInt(25, profile.getWeathercode_23());
			}
			else {
				pStmt.setString(25, null);
			}
			if (profile.getTemperture_0() != 1000 ) {
				pStmt.setDouble(26, profile.getTemperture_0());
			}
			else {
				pStmt.setString(26, null);
			}
			if (profile.getTemperture_1() != 1000 ) {
				pStmt.setDouble(27, profile.getTemperture_1());
			}
			else {
				pStmt.setString(27, null);
			}
			if (profile.getTemperture_2() != 1000 ) {
				pStmt.setDouble(28, profile.getTemperture_2());
			}
			else {
				pStmt.setString(28, null);
			}
			if (profile.getTemperture_3() != 1000 ) {
				pStmt.setDouble(29, profile.getTemperture_3());
			}
			else {
				pStmt.setString(29, null);
			}
			if (profile.getTemperture_4() != 1000 ) {
				pStmt.setDouble(30, profile.getTemperture_4());
			}
			else {
				pStmt.setString(30, null);
			}
			if (profile.getTemperture_5() != 1000 ) {
				pStmt.setDouble(31, profile.getTemperture_5());
			}
			else {
				pStmt.setString(31, null);
			}
			if (profile.getTemperture_6() != 1000 ) {
				pStmt.setDouble(32, profile.getTemperture_6());
			}
			else {
				pStmt.setString(32, null);
			}
			if (profile.getTemperture_7() != 1000 ) {
				pStmt.setDouble(33, profile.getTemperture_7());
			}
			else {
				pStmt.setString(33, null);
			}
			if (profile.getTemperture_8() != 1000 ) {
				pStmt.setDouble(34, profile.getTemperture_8());
			}
			else {
				pStmt.setString(34, null);
			}
			if (profile.getTemperture_9() != 1000 ) {
				pStmt.setDouble(35, profile.getTemperture_9());
			}
			else {
				pStmt.setString(35, null);
			}
			if (profile.getTemperture_10() != 1000 ) {
				pStmt.setDouble(36, profile.getTemperture_10());
			}
			else {
				pStmt.setString(36, null);
			}
			if (profile.getTemperture_11() != 1000 ) {
				pStmt.setDouble(37, profile.getTemperture_11());
			}
			else {
				pStmt.setString(37, null);
			}
			if (profile.getTemperture_12() != 1000 ) {
				pStmt.setDouble(38, profile.getTemperture_12());
			}
			else {
				pStmt.setString(38, null);
			}
			if (profile.getTemperture_13() != 1000 ) {
				pStmt.setDouble(39, profile.getTemperture_13());
			}
			else {
				pStmt.setString(39, null);
			}
			if (profile.getTemperture_14() != 1000 ) {
				pStmt.setDouble(40, profile.getTemperture_14());
			}
			else {
				pStmt.setString(40, null);
			}
			if (profile.getTemperture_15() != 1000 ) {
				pStmt.setDouble(41, profile.getTemperture_15());
			}
			else {
				pStmt.setString(41, null);
			}
			if (profile.getTemperture_16() != 1000 ) {
				pStmt.setDouble(42, profile.getTemperture_16());
			}
			else {
				pStmt.setString(42, null);
			}
			if (profile.getTemperture_17() != 1000 ) {
				pStmt.setDouble(43, profile.getTemperture_17());
			}
			else {
				pStmt.setString(43, null);
			}
			if (profile.getTemperture_18() != 1000 ) {
				pStmt.setDouble(44, profile.getTemperture_0());
			}
			else {
				pStmt.setString(44, null);
			}
			if (profile.getTemperture_19() != 1000 ) {
				pStmt.setDouble(45, profile.getTemperture_19());
			}
			else {
				pStmt.setString(45, null);
			}
			if (profile.getTemperture_20() != 1000 ) {
				pStmt.setDouble(46, profile.getTemperture_20());
			}
			else {
				pStmt.setString(46, null);
			}
			if (profile.getTemperture_21() != 1000 ) {
				pStmt.setDouble(47, profile.getTemperture_21());
			}
			else {
				pStmt.setString(47, null);
			}
			if (profile.getTemperture_22() != 1000 ) {
				pStmt.setDouble(48, profile.getTemperture_22());
			}
			else {
				pStmt.setString(48, null);
			}
			if (profile.getTemperture_23() != 1000 ) {
				pStmt.setDouble(49, profile.getTemperture_23());
			}
			else {
				pStmt.setString(49, null);
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


	public boolean update(Day_weathercode profile) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

			// SQL文を準備する
			String sql = "update DAY_WEATHERCODE set search_weatherinformation=?  where daily_ID=? ";
//
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (profile.getSearch_weatherinformation() != 100) {
				pStmt.setDouble(1, profile.getSearch_weatherinformation());
			}
			else {
				pStmt.setString(1, null);
			}
			if (profile.getDaily_ID() != 100) {
				pStmt.setDouble(2, profile.getDaily_ID());
			}
			else {
				pStmt.setString(2, null);
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
