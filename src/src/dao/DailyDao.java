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
	String sql = "select ID,DAY_DAY,USER_ID,DAY_HTEMPERATURE,DAY_LTEMPERATURE,DAY_WEATHERCODE,DAY_TOPSNO,DAY_OUTERNO1,DAY_OUTERNO2, DAY_BOTTOMNO from DAILY WHERE DAY_DAY=? AND USER_ID=? ORDER BY ID";
	PreparedStatement pStmt = conn.prepareStatement(sql);

	// SQL文を完成させる
	if (param.getDAY_DAY() != null) {
		pStmt.setString(1,  param.getDAY_DAY());
	}
	else {
		pStmt.setString(1, null);
	}
	if (param.getUSER_ID() != null && !param.getUSER_ID().equals("")) {
		pStmt.setString(2, param.getUSER_ID());
	}
	else {
		pStmt.setString(2, null);
	}



	// SQL文を実行し、結果表を取得する
	ResultSet rs = pStmt.executeQuery();

	// 結果表をコレクションにコピーする
	while (rs.next()) {
		Day card = new Day(
		rs.getInt("ID"),
		rs.getString("DAY_DAY"),
		rs.getString("USER_ID"),
		rs.getDouble("DAY_HTEMPERATURE"),
		rs.getDouble("DAY_LTEMPERATURE"),
		rs.getInt("DAY_WEATHERCODE"),
		rs.getInt("DAY_TOPSNO"),
		rs.getInt("DAY_OUTERNO1"),
		rs.getInt("DAY_OUTERNO2"),
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


// 引数param(日付)で検索項目を指定し、検索結果のリストを返す
public List<Day> selectsearch(Day param) {
	Connection conn = null;
	List<Day> cardList = new ArrayList<Day>();

	try {
		// JDBCドライバを読み込む
		Class.forName("org.h2.Driver");

		// データベースに接続する
		conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

		// SQL文を準備する
		String sql = "select ID,DAY_DAY,USER_ID,DAY_HTEMPERATURE,DAY_LTEMPERATURE,DAY_WEATHERCODE,DAY_TOPSNO,DAY_OUTERNO1, DAY_OUTERNO2,DAY_BOTTOMNO from DAILY WHERE DAY_DAY=? AND USER_ID=? ORDER BY ID";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		if (param.getDAY_DAY() != null) {
			pStmt.setString(1,  param.getDAY_DAY());
		}
		else {
			pStmt.setString(1, null);
		}
		if (param.getUSER_ID() != null && !param.getUSER_ID().equals("")) {
			pStmt.setString(2, param.getUSER_ID());
		}
		else {
			pStmt.setString(2, null);
		}



		// SQL文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		// 結果表をコレクションにコピーする
		while (rs.next()) {
			Day card = new Day(
			rs.getInt("ID"),
			rs.getString("DAY_DAY"),
			rs.getString("USER_ID"),
			rs.getDouble("DAY_HTEMPERATURE"),
			rs.getDouble("DAY_LTEMPERATURE"),
			rs.getInt("DAY_WEATHERCODE"),
			rs.getInt("DAY_TOPSNO"),
			rs.getInt("DAY_OUTERNO1"),
			rs.getInt("DAY_OUTERNO2"),
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

// DAY_HTEMPERATUREで検索項目を指定し、検索結果のリストを返す
public List<Day> selecth(String user_id,String DAY_HTEMPERATURE) {
	Connection conn = null;
	List<Day> cardList = new ArrayList<Day>();

	try {
		// JDBCドライバを読み込む
		Class.forName("org.h2.Driver");

		// データベースに接続する
		conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

		// SQL文を準備する
		String sql = "select ID,DAY_DAY,USER_ID,DAY_HTEMPERATURE,DAY_LTEMPERATURE,DAY_WEATHERCODE,DAY_TOPSNO,DAY_OUTERNO1, DAY_OUTERNO2,DAY_BOTTOMNO from DAILY WHERE USER_ID=? AND DAY_HTEMPERATURE=? ORDER BY ID";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		if (user_id != null && !user_id.equals("")) {
			pStmt.setString(1, user_id);
		}
		else {
			pStmt.setString(1, null);
		}
		if (DAY_HTEMPERATURE != null) {
			pStmt.setString(2, DAY_HTEMPERATURE);
		}
		else {
			pStmt.setString(2, null);
		}




		// SQL文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		// 結果表をコレクションにコピーする
		while (rs.next()) {
			Day card = new Day(
			rs.getInt("ID"),
			rs.getString("DAY_DAY"),
			rs.getString("USER_ID"),
			rs.getDouble("DAY_HTEMPERATURE"),
			rs.getDouble("DAY_LTEMPERATURE"),
			rs.getInt("DAY_WEATHERCODE"),
			rs.getInt("DAY_TOPSNO"),
			rs.getInt("DAY_OUTERNO1"),
			rs.getInt("DAY_OUTERNO2"),
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



//DAY_HTEMPERATUREで検索項目を指定し、検索結果のリストを返す
public List<Day> selectl(String user_id,String DAY_LTEMPERATURE) {
	Connection conn = null;
	List<Day> cardList = new ArrayList<Day>();

	try {
		// JDBCドライバを読み込む
		Class.forName("org.h2.Driver");

		// データベースに接続する
		conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

		// SQL文を準備する
		String sql = "select ID,DAY_DAY,USER_ID,DAY_HTEMPERATURE,DAY_LTEMPERATURE,DAY_WEATHERCODE,DAY_TOPSNO,DAY_OUTERNO1, DAY_OUTERNO2,DAY_BOTTOMNO from DAILY WHERE USER_ID=? AND DAY_LTEMPERATURE=? ORDER BY ID";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		if (user_id != null && !user_id.equals("")) {
			pStmt.setString(1, user_id);
		}
		else {
			pStmt.setString(1, null);
		}
		if (DAY_LTEMPERATURE != null) {
			pStmt.setString(2, DAY_LTEMPERATURE);
		}
		else {
			pStmt.setString(2, null);
		}




		// SQL文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		// 結果表をコレクションにコピーする
		while (rs.next()) {
			Day card = new Day(
			rs.getInt("ID"),
			rs.getString("DAY_DAY"),
			rs.getString("USER_ID"),
			rs.getDouble("DAY_HTEMPERATURE"),
			rs.getDouble("DAY_LTEMPERATURE"),
			rs.getInt("DAY_WEATHERCODE"),
			rs.getInt("DAY_TOPSNO"),
			rs.getInt("DAY_OUTERNO1"),
			rs.getInt("DAY_OUTERNO2"),
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
	String sql = "update DAILY set DAY_TOPSNO=?,DAY_OUTERNO1=?,DAY_OUTERNO2=?,DAY_BOTTOMNO=?  where ID=? ";

	PreparedStatement pStmt = conn.prepareStatement(sql);

	// SQL文を完成させる
	if (day.getDAY_TOPSNO() != 0 ) {
		pStmt.setInt(1, day.getDAY_TOPSNO());
	}
	else {
		pStmt.setString(1, null);
	}
	if (day.getDAY_OUTERNO1() != 0) {
		pStmt.setInt(2, day.getDAY_OUTERNO1());
	}
	else {
		pStmt.setString(2, null);
	}
	if (day.getDAY_OUTERNO2() != 0) {
		pStmt.setInt(3, day.getDAY_OUTERNO2());
	}
	else {
		pStmt.setString(3, null);
	}
	if (day.getDAY_BOTTOMNO() != 0 ) {
		pStmt.setInt(4, day.getDAY_BOTTOMNO());
	}
	else {
		pStmt.setString(4, null);
	}

	pStmt.setInt(5, day.getID());

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
		String sql = "insert into DAILY (DAY_DAY,USER_ID,DAY_HTEMPERATURE,DAY_LTEMPERATURE,DAY_WEATHERCODE ) values ( CURDATE(),?,?,?,?)";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
	/*	if (card.getNumber() != 0 ) {
			pStmt.setInt(1, card.getNumber());
		}
		else {
			pStmt.setInt(1, 0);
		}*/


		if (day.getUSER_ID() != null && !day.getUSER_ID().equals("")) {
			pStmt.setString(1, day.getUSER_ID());
		}
		else {
			pStmt.setString(1, null);
		}
		if (day.getDAY_HTEMPERTURE() != 0 ) {
			pStmt.setDouble(2, day.getDAY_HTEMPERTURE());
		}
		else {
			pStmt.setDouble(2, 0);
		}
		if (day.getDAY_LTEMPERTURE() != 0 ) {
			pStmt.setDouble(3, day.getDAY_LTEMPERTURE());
		}
		else {
			pStmt.setDouble(3, 0);
		}
		if (day.getDAY_WEATHERCODE() != 0 ) {
			pStmt.setDouble(4, day.getDAY_WEATHERCODE());
		}
		else {
			pStmt.setDouble(4, 0);
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



public int count(Day param) {
	Connection conn = null;
	int inforezult = 0;

	try {
		// JDBCドライバを読み込む
		Class.forName("org.h2.Driver");

		// データベースに接続する
		conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/C4","sa","");

		// SQL文を準備する
		String sql = "select count (DAY_DAY=CURDATE() AND USER_ID = ? OR NULL)as info FROM DAILY";
		PreparedStatement pStmt = conn.prepareStatement(sql);

		// SQL文を完成させる
		if (param.getUSER_ID()!= null) {
			pStmt.setString(1,  param.getUSER_ID());
		}
		else {
			pStmt.setString(1, null);
		}



		// SQL文を実行し、結果表を取得する
		ResultSet rs = pStmt.executeQuery();

		// 結果表をコレクションにコピーする
		rs.next();
		if (rs.getInt("INFO") == 1) {
			inforezult = 1;
		}
	}




	catch (SQLException e) {
		e.printStackTrace();
		inforezult = 2;
	}
	catch (ClassNotFoundException e) {
		e.printStackTrace();
		inforezult = 2;
	}
	finally {
		// データベースを切断
		if (conn != null) {
			try {
			conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
			inforezult = 2;
		}
	}
	}

	// 結果を返す
	return inforezult;
	}
}
