package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Gender;

public class GenderDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す
			public List<Gender> select(Gender param) {
				Connection conn = null;
				List<Gender> cardList = new ArrayList<Gender>();

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

					// SQL文を準備する
					String sql = "select ID, GENDER_CATEGORY from GENDER WHERE ID LIKE ? ORDER BY ID";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
					if (param.getID() != 0) {
						pStmt.setString(1, "%" + param.getID() + "%");
					}









					// SQL文を実行し、結果表を取得する
					ResultSet rs = pStmt.executeQuery();

					// 結果表をコレクションにコピーする
					while (rs.next()) {
						Gender card = new Gender(
						rs.getInt("ID"),
						rs.getString("GENDER_CATEGORY")
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
