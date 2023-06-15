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

import model.User;

/**
 * @author user
 *
 */
public class UsersDao {

		// 引数paramで検索項目を指定し、検索結果のリストを返す
		public List<User> select(User param) {
			Connection conn = null;
			List<User> cardList = new ArrayList<User>();

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

				// SQL文を準備する
				String sql = "select ID, USER_ID,USER_PW,USER_HOMEID,USER_GENDERID,USER_PTEMPERTUREID from USERS WHERE ID LIKE ? ORDER BY ID";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (param.getID() != 0) {
					pStmt.setString(1, "%" + param.getID() + "%");
				}









				// SQL文を実行し、結果表を取得する
				ResultSet rs = pStmt.executeQuery();

				// 結果表をコレクションにコピーする
				while (rs.next()) {
					User card = new User(
					rs.getInt("ID"),
					rs.getString("USER_ID"),
					rs.getString("USER_PW"),
					rs.getInt("USER_HOMEID"),
					rs.getInt("USER_GENDERID"),
					rs.getInt("USER_PTEMPERTUREID")
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
		public boolean update(User profile) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

				// SQL文を準備する
				String sql = "update USERS set USER_ID=?,USER_PW=?,USER_HOMEID=?,USER_GENDERID=?,USER_PTEMPERTUREID=?  where ID=? ";
//
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (profile.getUSER_ID() != null && !profile.getUSER_ID().equals("")) {
					pStmt.setString(1, profile.getUSER_ID());
				}
				else {
					pStmt.setString(1, null);
				}
				if (profile.getUSER_PW() != null && !profile.getUSER_PW().equals("")) {
					pStmt.setString(2, profile.getUSER_PW());
				}
				else {
					pStmt.setString(2, null);
				}
				if (profile.getUSER_HOMEID() != 0 ) {
					pStmt.setInt(3, profile.getUSER_HOMEID());
				}
				else {
					pStmt.setString(3, null);
				}

				if (profile.getUSER_GENDERID() != 0 ) {
					pStmt.setInt(4, profile.getUSER_GENDERID());
				}
				else {
					pStmt.setString(4, null);
				}

				if (profile.getUSER_PTEMPERTUREID() != 0 ) {
					pStmt.setInt(5, profile.getUSER_PTEMPERTUREID());
				}
				else {
					pStmt.setString(5, null);
				}


				pStmt.setInt(6, profile.getID());

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

		public boolean insert(User profile) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");
	/*?の数*/
				// SQL文を準備する
				String sql = "insert into USERS (USER_ID,USER_PW,USER_HOMEID,USER_GENDERID,USER_PTEMPERTUREID ) values ( ?, ?,?,?,?)";
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
				if (profile.getUSER_PW() != null && !profile.getUSER_PW().equals("")) {
					pStmt.setString(2, profile.getUSER_PW());
				}
				else {
					pStmt.setString(2, null);
				}
				if (profile.getUSER_HOMEID() != 0 ) {
					pStmt.setInt(3, profile.getUSER_HOMEID());
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
