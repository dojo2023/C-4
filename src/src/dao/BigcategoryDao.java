package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Big_category;

public class BigcategoryDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す Listselectを作ってる
				public List<Big_category> select(Big_category param) {
					Connection conn = null;
					List<Big_category> cardList = new ArrayList<Big_category>();

					try {
						// JDBCドライバを読み込む
						Class.forName("org.h2.Driver");

						// データベースに接続する
						conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

						// SQL文を準備する
						String sql = "select ID, BIG_CATEGORY from BIGCATEGORY WHERE ID = ? ORDER BY ID";
						PreparedStatement pStmt = conn.prepareStatement(sql);

						// SQL文を完成させる IDが0でなければ 1は一番初めの？を指す
						if (param.getID() != 0) {
							pStmt.setInt(1,  param.getID() );
						}









						// SQL文を実行し、結果表を取得する
						ResultSet rs = pStmt.executeQuery();

						// 結果表をコレクションにコピーする
						while (rs.next()) {
							Big_category card = new Big_category(
							rs.getInt("ID"),
							rs.getString("BIG_CATEGORY")
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
