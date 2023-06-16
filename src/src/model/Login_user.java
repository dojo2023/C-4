package model;

public class Login_user {
	//private int ID;	// ログイン時のID
    private String USER_ID;//ログイン時のUSER_ID
	public Login_user() {
		//this.ID=0;
		this.USER_ID="";

	}

	public Login_user(String user_id) {
		this.USER_ID= user_id;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setID(String user_id) {
		this.USER_ID = user_id;
	}
}
