package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cloth;

public class ClothesDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す
			public List<Cloth> select(Cloth param) {
				Connection conn = null;
				List<Cloth> cardList = new ArrayList<Cloth>();
//tryの上まで１２:00

				try {
					// JDBCドライバを読み込む,
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

					// SQL文を準備する
					String sql = "select ID, USER_ID, CLO_IMAGES ,SMALL_CATEGORYID from CLOTHES WHERE ID LIKE ? ORDER BY ID";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
					if (param.getID() != 0) {
						pStmt.setString(1, "%" + param.getID() + "%");
					}



					// SQL文を実行し、結果表を取得する
					ResultSet rs = pStmt.executeQuery();

					// 結果表をコレクションにコピーする
					while (rs.next()) {
						Cloth card = new Cloth(
						rs.getInt("ID"),
						rs.getString("USER_ID"),
						rs.getInt("SMALL_CATEGORYID"),
						rs.getString("CLO_IMAGES")
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
			public boolean update(Cloth profile) {
				Connection conn = null;
				boolean result = false;

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

					// SQL文を準備する
					String sql = "update CLOTHES set USER_ID=?,SMALL_CATEGORYID=?,CLO_IMAGES=? where ID=? ";
	//
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
					if (profile.getUSER_ID() != null && !profile.getUSER_ID().equals("")) {
						pStmt.setString(1, profile.getUSER_ID());
					}
					else {
						pStmt.setString(1, null);
					}
					if (profile.getSMALL_CATEGORYID() != 0 ) {
						pStmt.setInt(2, profile.getSMALL_CATEGORYID());
					}
					else {
						pStmt.setInt(2, 0);
					}
					if (profile.getCLO_IMAGES() != null && !profile.getCLO_IMAGES().equals("")) {
						pStmt.setString(3, profile.getCLO_IMAGES());
					}
					else {
						pStmt.setString(3, null);
					}

					pStmt.setInt(4, profile.getID());

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



			public boolean insert(Cloth profile) {
				Connection conn = null;
				boolean result = false;

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");
		/*?の数*/
					// SQL文を準備する
					String sql = "insert into CLOTHES (USER_ID,SMALL_CATEGORYID,CLO_IMAGES) values ( ?,?,?)";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
				/*	if (card.getNumber() != 0 ) {
						pStmt.setInt(1, card.getNumber());
					}
					else {
						pStmt.setInt(1, 0);
					}*/
					if (profile.getUSER_ID() != null && !profile.getUSER_ID().equals("")) {
						pStmt.setString(1, profile.getUSER_ID());
					}
					else {
						pStmt.setString(1, null);
					}
					if (profile.getSMALL_CATEGORYID() != 0 ) {
						pStmt.setInt(2, profile.getSMALL_CATEGORYID());
					}
					else {
						pStmt.setInt(2, 0);
					}
					if (profile.getCLO_IMAGES() != null && !profile.getCLO_IMAGES().equals("")) {
						pStmt.setString(3, profile.getCLO_IMAGES());
					}
					else {
						pStmt.setString(3, null);
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



			// 引数numberで指定されたレコードを削除し、成功したらtrueを返す
			public boolean delete(int ID) {
				Connection conn = null;
				boolean result = false;

				try {
					// JDBCドライバを読み込む
					Class.forName("org.h2.Driver");

					// データベースに接続する
					conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4", "sa", "");

					// SQL文を準備する
					String sql = "delete from CLOTHES  where ID=?";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					// SQL文を完成させる
					pStmt.setInt(1, ID);

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
