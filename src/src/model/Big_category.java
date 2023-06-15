package model;

import java.io.Serializable;

public class Big_category implements Serializable {
	private int ID;
	private String BIG_CATEGORY;

	public Big_category(int ID,String BIG_CATEGORY){
		this.ID = ID;
		this.BIG_CATEGORY = BIG_CATEGORY;

}

	public Big_category(int ID){
		this.ID = ID;
		this.BIG_CATEGORY = "";
        }

	public Big_category(){
		this.ID = 0;
		this.BIG_CATEGORY= "";
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getBIG_CATEGORY() {
		return BIG_CATEGORY;
	}
	public void setBIG_CATEGORY(String BIG_CATEGORY) {
		this.BIG_CATEGORY = BIG_CATEGORY;
	}
}
