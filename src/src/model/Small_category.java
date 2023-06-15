/**
 *
 */
package model;

import java.io.Serializable;

/**
 * @author user
 *
 */
public class Small_category implements Serializable {
	private int ID;
	private String SMALL_CATEGORY;
	private int BIGCATEGORY_ID;

	public Small_category(int ID,String SMALL_CATEGORY,int BIGCATEGORY_ID){
		this.ID = ID;
		this.SMALL_CATEGORY = SMALL_CATEGORY;
		this.BIGCATEGORY_ID = BIGCATEGORY_ID;
	}

	public Small_category(int ID){
		this.ID = ID;
		this.SMALL_CATEGORY = "";
		this.BIGCATEGORY_ID = 0;
        }

	public Small_category(){
		this. ID = 0;
		this.SMALL_CATEGORY = "";
		this.BIGCATEGORY_ID = 0;

	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getSMALL_CATEGORY() {
		return SMALL_CATEGORY;
	}

	public void setSMALL_CATEGORY(String SMALL_CATEGORY) {
		this.SMALL_CATEGORY = SMALL_CATEGORY;
	}

	public int getBIGCATEGORY_ID() {
		return BIGCATEGORY_ID;
	}

	public void setBIGCATEGORY_ID(int BIGCATEGORY_ID) {
		this.BIGCATEGORY_ID = BIGCATEGORY_ID;
	}
}
