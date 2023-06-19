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
	private int DAY_OUTERNO;
	private int DAY_BOTTOMNO;

	public Day(int ID,String DAY_DAY,String USER_ID,double DAY_HTEMPERTURE ,double DAY_LTEMPERTURE,int DAY_WEATHERCODE,int DAY_TOPSNO,int DAY_OUTERNO,int DAY_BOTTOMNO){
		this.ID = ID;
		this.USER_ID = USER_ID;
		this.DAY_HTEMPERTURE = DAY_HTEMPERTURE;
		this.DAY_LTEMPERTURE = DAY_LTEMPERTURE;
		this.DAY_WEATHERCODE = DAY_WEATHERCODE;
        this.DAY_TOPSNO = DAY_TOPSNO;
        this.DAY_OUTERNO = DAY_OUTERNO;
        this.DAY_BOTTOMNO = DAY_BOTTOMNO;
	}




	public Day(String USER_ID, String DAY_DAY){
		this.ID = 0;
		this.USER_ID = USER_ID;
		this.DAY_HTEMPERTURE = 0;
		this.DAY_LTEMPERTURE = 0;
        this.DAY_TOPSNO =0;
        this.DAY_OUTERNO = 0;
        this.DAY_BOTTOMNO = 0;
        this.DAY_DAY = DAY_DAY;
	}

	public Day(){
		this.ID = 0;
		this.USER_ID = "";
		this.DAY_HTEMPERTURE = 0;
		this.DAY_LTEMPERTURE = 0;
        this.DAY_TOPSNO = 0;
        this.DAY_OUTERNO = 0;
        this.DAY_BOTTOMNO = 0;

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

	public int getDAY_OUTERNO() {
		return DAY_OUTERNO;
	}

	public void setDAY_OUTERNO(int DAY_OUTERNO) {
		this.DAY_OUTERNO = DAY_OUTERNO;
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


}
