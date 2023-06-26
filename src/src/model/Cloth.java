package model;

import java.io.Serializable;

public class Cloth implements Serializable {
	private int ID;
	private String USER_ID;
	private int SMALL_CATEGORYID;
	private String CLO_IMAGES;
	private String CLO_NAME;
	private String SMALL_NAME;
	private String SMALL_TAG;
	//private String SMALL_CATEGORY;
	//引数アリのコンストラクタの設定
	public Cloth(int ID,String USER_ID,int SMALL_CATEGORYID,String CLO_IMAGES){
		this.ID = ID;
		this.USER_ID = USER_ID;
		this.SMALL_CATEGORYID = SMALL_CATEGORYID;
		this.CLO_IMAGES = CLO_IMAGES;

		}
	public Cloth(String USER_ID,int SMALL_CATEGORYID,String CLO_IMAGES){
		this.USER_ID = USER_ID;
	    this.SMALL_CATEGORYID = SMALL_CATEGORYID;
		this.CLO_IMAGES = CLO_IMAGES;

		}

	public Cloth(int ID){
		this.ID = ID;
		this.USER_ID = "";
		this.SMALL_CATEGORYID = 0;
		this.CLO_IMAGES = "";
        }
	public Cloth(int ID,String USER_ID,String SMALL_CATEGORY,String CLO_IMAGES){
		this.ID = ID;
		this.USER_ID = USER_ID;
		//this.SMALL_CATEGORY = SMALL_CATEGORY;
		this.CLO_IMAGES = CLO_IMAGES;

		}
	public Cloth(int ID,int SMALL_CATEGORYID,String CLO_IMAGES){
		this.ID = ID;
	    this.SMALL_CATEGORYID = SMALL_CATEGORYID;
		this.CLO_IMAGES = CLO_IMAGES;
		}


	//引数なしのコンストラクタの設定
	public Cloth(){
		this.ID = 0;
		this.USER_ID = "";
		this.SMALL_CATEGORYID = 0;
	    this.CLO_IMAGES = "";
	    this.CLO_NAME ="";
	    this.SMALL_NAME="";
	    this.SMALL_TAG="";
		}
	public Cloth(String iD2, int sMALL_CATEGORYID2, String sMALL_CATEGORY, String cLO_IMAGES2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}
	public String getCLO_IMAGES() {
		return CLO_IMAGES;
	}
	public void setCLO_IMAGES(String CLO_IMAGES) {
		this.CLO_IMAGES = CLO_IMAGES;
	}
	public int getSMALL_CATEGORYID() {
		return SMALL_CATEGORYID;
	}
	public void setSMALL_CATEGORYID(int SMALL_CATEGORYID) {
		this.SMALL_CATEGORYID = SMALL_CATEGORYID;
	}
	public String getCLO_NAME() {
		return CLO_NAME;
	}
	public void setCLO_NAME(String cLO_NAME) {
		CLO_NAME = cLO_NAME;
	}
	public String getSMALL_NAME() {
		return SMALL_NAME;
	}
	public void setSMALL_NAME(String sMALL_NAME) {
		SMALL_NAME = sMALL_NAME;
	}
	public String getSMALL_TAG() {
		return SMALL_TAG;
	}
	public void setSMALL_TAG(String SMALL_TAG) {
		this.SMALL_TAG = SMALL_TAG;
	}




}
