package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Small_category;

public class SmallcategoryDao {
	public SmallcategoryDao(String small_category) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

			public SmallcategoryDao() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

			// 引数paramで検索項目を指定し、検索結果のリストを返す
			public List<Small_category> select(Small_category param) {
				Connection conn = null;
				List<Small_category> cardList = new ArrayList<Small_category>();

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

					// SQL文を準備する
					String sql = "select ID, SMALL_CATEGORY,BIGCATEGORY_ID from SMALLCATEGORY WHERE ID = ? ORDER BY ID";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
					if (param.getID() != 0) {
						pStmt.setString(1, "%" + param.getID() + "%");
					}









					// SQL文を実行し、結果表を取得する
					ResultSet rs = pStmt.executeQuery();

					// 結果表をコレクションにコピーする
					while (rs.next()) {
						Small_category card = new Small_category(
						rs.getInt("ID"),
						rs.getString("SMALL_CATEGORY"),
						rs.getInt("BIGCATEGORY_ID")
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


			// 引数paramで検索項目を指定し、検索結果のリストを返す
			public List<Small_category> selectall(Small_category param) {
				Connection conn = null;
				List<Small_category> cardList = new ArrayList<Small_category>();

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

				// SQL文を準備する
				String sql = "select ID, SMALL_CATEGORY,BIGCATEGORY_ID from SMALLCATEGORY ORDER BY ID";
				PreparedStatement pStmt = conn.prepareStatement(sql);
//
//				// SQL文を完成させる
//				if (param.getID() != 0) {
//					pStmt.setString(1, "%" + param.getID() + "%");
//				}









				// SQL文を実行し、結果表を取得する
				ResultSet rs = pStmt.executeQuery();

				// 結果表をコレクションにコピーする
				while (rs.next()) {
					Small_category card = new Small_category(
					rs.getInt("ID"),
					rs.getString("SMALL_CATEGORY"),
					rs.getInt("BIGCATEGORY_ID")
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

			public Small_category selectID(int ID) {
				Connection conn = null;
				Small_category card = new Small_category();

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

					// SQL文を準備する
					String sql = "select ID, SMALL_CATEGORY,BIGCATEGORY_ID from SMALLCATEGORY WHERE ID = ? ORDER BY ID";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
					if (ID != 0) {
						pStmt.setInt(1, ID);
					}









					// SQL文を実行し、結果表を取得する
					ResultSet rs = pStmt.executeQuery();

					// 結果表をコレクションにコピーする
					while (rs.next()) {
						 card = new Small_category(
						rs.getInt("ID"),
						rs.getString("SMALL_CATEGORY"),
						rs.getInt("BIGCATEGORY_ID")
						);

					}
				}
				catch (SQLException e) {
					e.printStackTrace();
					card = null;
				}
				catch (ClassNotFoundException e) {
					e.printStackTrace();
					card = null;
				}
				finally {
					// データベースを切断
					if (conn != null) {
						try {
							conn.close();
						}
						catch (SQLException e) {
							e.printStackTrace();
							card = null;
						}
					}
				}

				// 結果を返す
				return card;
			}










			public boolean update(SmallcategoryDao smallcategoryDao) {
				// TODO 自動生成されたメソッド・スタブ
				return false;
			}


}
