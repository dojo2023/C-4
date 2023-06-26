package model;

import java.io.Serializable;

public class Day implements Serializable {
	private int ID;
	private String DAY_DAY ;
	private String USER_ID;
	private double DAY_HTEMPERTURE;
	private double DAY_LTEMPERTURE;
	private int DAY_WEATHERCODE;
	private int DAY_TOPSNO;
	private String DAY_TOPSNAME;
	private String DAY_TOPSTAG;
	private int DAY_OUTERNO1;
	private String DAY_OUTER1NAME;
	private String DAY_OUTER1TAG;
	private int DAY_OUTERNO2;
	private String DAY_OUTER2NAME;
	private String DAY_OUTER2TAG;
	private int DAY_BOTTOMNO;
	private String DAY_BOTTOMNAME;
	private String DAY_BOTTOMTAG;

	public Day(int ID,String DAY_DAY,String USER_ID,double DAY_HTEMPERTURE ,double DAY_LTEMPERTURE,int DAY_WEATHERCODE,int DAY_TOPSNO,int DAY_OUTERNO1,int DAY_OUTERNO2,int DAY_BOTTOMNO){
		this.ID = ID;
		this.DAY_DAY = DAY_DAY;
		this.USER_ID = USER_ID;
		this.DAY_HTEMPERTURE = DAY_HTEMPERTURE;
		this.DAY_LTEMPERTURE = DAY_LTEMPERTURE;
		this.DAY_WEATHERCODE = DAY_WEATHERCODE;
        this.DAY_TOPSNO = DAY_TOPSNO;
        this.DAY_OUTERNO1 = DAY_OUTERNO1;
        this.DAY_OUTERNO2 = DAY_OUTERNO2;
        this.DAY_BOTTOMNO = DAY_BOTTOMNO;
	}




	public Day(String USER_ID, String DAY_DAY){
		this.ID = 0;
		this.USER_ID = USER_ID;
		this.DAY_HTEMPERTURE = 0;
		this.DAY_LTEMPERTURE = 0;
        this.DAY_TOPSNO =0;
        this.DAY_OUTERNO1 = 0;
        this.DAY_BOTTOMNO = 0;
        this.DAY_DAY = DAY_DAY;
	}

	public Day(String day_day2, String user_id2, String day_htemperture2, String day_ltemperture2){
		this.ID = 0;
		this.DAY_DAY = "";
		this.USER_ID = "";
		this.DAY_HTEMPERTURE = 0;
		this.DAY_LTEMPERTURE = 0;
        this.DAY_TOPSNO = 0;
        this.DAY_OUTERNO1 = 0;
        this.DAY_BOTTOMNO = 0;

	}

	public Day(String day_day2, String day_htemperture2, String day_ltemperture2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}




	public Day() {
		// TODO 自動生成されたコンストラクター・スタブ
	}




	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getDAY_DAY() {
		return DAY_DAY;
	}

	public void setDAY_DAY(String DAY_DAY) {
		this.DAY_DAY = DAY_DAY;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}

	public double getDAY_HTEMPERTURE() {
		return DAY_HTEMPERTURE;
	}

	public void setDAY_HTEMPERTURE(double DAY_HTEMPERTURE) {
		this.DAY_HTEMPERTURE = DAY_HTEMPERTURE;
	}

	public double getDAY_LTEMPERTURE() {
		return DAY_LTEMPERTURE;
	}

	public void setDAY_LTEMPERTURE(double DAY_LTEMPERTURE) {
		this.DAY_LTEMPERTURE = DAY_LTEMPERTURE;
	}

	public int getDAY_TOPSNO() {
		return DAY_TOPSNO;
	}

	public void setDAY_TOPSNO(int DAY_TOPSNO) {
		this.DAY_TOPSNO = DAY_TOPSNO;
	}

	public int getDAY_BOTTOMNO() {
		return DAY_BOTTOMNO;
	}

	public void setDAY_BOTTOMNO(int DAY_BOTTOMNO) {
		this.DAY_BOTTOMNO = DAY_BOTTOMNO;
	}




	public int getDAY_WEATHERCODE() {
		return DAY_WEATHERCODE;
	}




	public void setDAY_WEATHERCODE(int dAY_WEATHERCODE) {
		DAY_WEATHERCODE = dAY_WEATHERCODE;
	}




	public int getDAY_OUTERNO1() {
		return DAY_OUTERNO1;
	}




	public void setDAY_OUTERNO1(int dAY_OUTERNO1) {
		DAY_OUTERNO1 = dAY_OUTERNO1;
	}




	public int getDAY_OUTERNO2() {
		return DAY_OUTERNO2;
	}




	public void setDAY_OUTERNO2(int dAY_OUTERNO2) {
		DAY_OUTERNO2 = dAY_OUTERNO2;
	}




	public String getDAY_TOPSNAME() {
		return DAY_TOPSNAME;
	}




	public void setDAY_TOPSNAME(String dAY_TOPSNAME) {
		DAY_TOPSNAME = dAY_TOPSNAME;
	}




	public String getDAY_TOPSTAG() {
		return DAY_TOPSTAG;
	}




	public void setDAY_TOPSTAG(String dAY_TOPSTAG) {
		DAY_TOPSTAG = dAY_TOPSTAG;
	}




	public String getDAY_OUTER1NAME() {
		return DAY_OUTER1NAME;
	}




	public void setDAY_OUTER1NAME(String dAY_OUTER1NAME) {
		DAY_OUTER1NAME = dAY_OUTER1NAME;
	}




	public String getDAY_OUTER1TAG() {
		return DAY_OUTER1TAG;
	}




	public void setDAY_OUTER1TAG(String dAY_OUTER1TAG) {
		DAY_OUTER1TAG = dAY_OUTER1TAG;
	}




	public String getDAY_OUTER2NAME() {
		return DAY_OUTER2NAME;
	}




	public void setDAY_OUTER2NAME(String dAY_OUTER2NAME) {
		DAY_OUTER2NAME = dAY_OUTER2NAME;
	}




	public String getDAY_OUTER2TAG() {
		return DAY_OUTER2TAG;
	}




	public void setDAY_OUTER2TAG(String dAY_OUTER2TAG) {
		DAY_OUTER2TAG = dAY_OUTER2TAG;
	}




	public String getDAY_BOTTOMNAME() {
		return DAY_BOTTOMNAME;
	}




	public void setDAY_BOTTOMNAME(String dAY_BOTTOMNAME) {
		DAY_BOTTOMNAME = dAY_BOTTOMNAME;
	}




	public String getDAY_BOTTOMTAG() {
		return DAY_BOTTOMTAG;
	}




	public void setDAY_BOTTOMTAG(String dAY_BOTTOMTAG) {
		DAY_BOTTOMTAG = dAY_BOTTOMTAG;
	}


}
