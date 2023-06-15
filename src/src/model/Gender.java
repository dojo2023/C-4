package model;

import java.io.Serializable;

public class Gender implements Serializable {
	private int ID;
	private String GENDER_CATEGORY;

	public Gender(int ID,String GENDER_CATEGORY){
		this.ID = ID;
		this.GENDER_CATEGORY = GENDER_CATEGORY;

	}

	public Gender(int ID){
		this.ID = ID;
		this.GENDER_CATEGORY = "";
        }

	public Gender(){
		this.ID = 0;
		this.GENDER_CATEGORY= "";
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getGENDER_CATEGORY() {
		return GENDER_CATEGORY;
	}
	public void setGENDER_CATEGORY(String GENDER_CATEGORY) {
		this.GENDER_CATEGORY = GENDER_CATEGORY;
	}
}
