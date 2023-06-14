package model;
import java.io.Serializable;


public class User implements Serializable {
	private int ID;
	private String USER_ID;
	private String USER_PW;
	private int USER_HOMEID;
	private int USER_GENDERID;
	private int USER_PTEMPERTUREID;
//引数アリのコンストラクタの設定
	public User(String USER_ID,String USER_PW,int USER_HOMEID,int USER_GENDERID,int USER_PTEMPERTUREID){
		this.USER_ID = USER_ID;
		this.USER_PW = USER_PW;
		this.USER_HOMEID = USER_HOMEID;
        this.USER_GENDERID = USER_GENDERID;
        this.USER_PTEMPERTUREID = USER_PTEMPERTUREID;

	}

	public User(int ID,String USER_ID,String USER_PW,int USER_HOMEID,int USER_GENDERID,int USER_PTEMPERTUREID){
		this.ID = ID;
		this.USER_ID = USER_ID;
		this.USER_PW = USER_PW;
		this.USER_HOMEID = USER_HOMEID;
        this.USER_GENDERID = USER_GENDERID;
        this.USER_PTEMPERTUREID = USER_PTEMPERTUREID;
        }

//引数なしのコンストラクタの設定
	public User(){
		this.USER_ID = "";
		this.USER_PW = "";
		this.USER_HOMEID = 0;
        this.USER_GENDERID = 0;
        this.USER_PTEMPERTUREID = 0;

	}
	public int getID() {
		return ID;
	}


	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}
	public String getUSER_PW() {
		return USER_PW;
	}
	public void setUSER_PW(String USER_PW) {
		this.USER_PW = USER_PW;
	}
	public int getUSER_HOMEID() {
		return USER_HOMEID;
	}
	public void setUSER_HOMEID(int USER_HOMEID) {
		this.USER_HOMEID = USER_HOMEID;
	}
	public int getUSER_GENDERID() {
		return USER_GENDERID;
	}
	public void setUSER_GENDERID(int USER_GENDERID) {
		this.USER_GENDERID = USER_GENDERID;
	}
	public int getUSER_PTEMPERTUREID() {
		return USER_PTEMPERTUREID;
	}
	public void setUSER_PTEMPERTUREID(int USER_PTEMPERTUREID) {
		this.USER_PTEMPERTUREID = USER_PTEMPERTUREID;
	}



}
