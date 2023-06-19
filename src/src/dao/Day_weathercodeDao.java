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


}
