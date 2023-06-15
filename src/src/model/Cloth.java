package model;

import java.io.Serializable;

public class Cloth implements Serializable {
	private int ID;
	private String USER_ID;
	private int CLO_IMAGES;
	private String SMALL_CATEGORYID;

	//引数アリのコンストラクタの設定
	public Cloth(int ID,String USER_ID,int CLO_IMAGES,String SMALL_CATEGORYID){
		this.ID = ID;
		this.USER_ID = USER_ID;
		this.CLO_IMAGES = CLO_IMAGES;
	    this.SMALL_CATEGORYID = SMALL_CATEGORYID;
		}
	public Cloth(String USER_ID,int CLO_IMAGES,String SMALL_CATEGORYID){
		this.USER_ID = USER_ID;
		this.CLO_IMAGES = CLO_IMAGES;
	    this.SMALL_CATEGORYID = SMALL_CATEGORYID;
		}

	public Cloth(int ID){
		this.ID = ID;
		this.USER_ID = "";
		this.CLO_IMAGES = 0;
		this.SMALL_CATEGORYID = "";
        }
	//引数なしのコンストラクタの設定
	public Cloth(){
		this.ID = 0;
		this.USER_ID = "";
		this.CLO_IMAGES = 0;
	    this.SMALL_CATEGORYID = "";
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
	public int getCLO_IMAGES() {
		return CLO_IMAGES;
	}
	public void setCLO_IMAGES(int CLO_IMAGES) {
		this.CLO_IMAGES = CLO_IMAGES;
	}
	public String getSMALL_CATEGORYID() {
		return SMALL_CATEGORYID;
	}
	public void setSMALL_CATEGORYID(String SMALL_CATEGORYID) {
		this.SMALL_CATEGORYID = SMALL_CATEGORYID;
	}



}
