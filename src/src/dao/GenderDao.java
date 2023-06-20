package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Gender;

public class GenderDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す Listselectを作ってる
			public Gender select(int ID) {
				Connection conn = null;
				Gender GENDER = new Gender();

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

					// SQL文を準備する
					String sql = "select ID, GENDER_CATEGORY from GENDER WHERE ID = ? ";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる IDが0でなければ 1は一番初めの？を指す
					if (ID != 0) {
						pStmt.setInt(1, ID );
					}









					// SQL文を実行し、結果表を取得する
					ResultSet rs = pStmt.executeQuery();

					// 結果表をコレクションにコピーする
					while (rs.next()) {
						Gender card = new Gender(
						rs.getInt("ID"),
						rs.getString("GENDER_CATEGORY")
						);
						GENDER = card;
					}
				}
				catch (SQLException e) {
					e.printStackTrace();
					GENDER = null;
				}
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				    GENDER = null;
				}
				finally {
					// データベースを切断
					if (conn != null) {
						try {
							conn.close();
						}
						catch (SQLException e) {
							e.printStackTrace();
							GENDER = null;
						}
					}
				}

				// 結果を返す
				return GENDER;
			}

}
