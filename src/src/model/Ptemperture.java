package model;

import java.io.Serializable;

public class Ptemperture implements Serializable {
	private int ID;
	private int USER_PTEMPERTURE;
	private int PTEM_MAXPTEM;
	private int PTEM_MINPTEM;

	public Ptemperture(int ID,int USER_PTEMPERTURE,int PTEM_MAXPTEM,int PTEM_MINPTEM){
		this.ID = ID;
		this.USER_PTEMPERTURE = USER_PTEMPERTURE;
		this.PTEM_MAXPTEM = PTEM_MAXPTEM;
	    this.PTEM_MINPTEM = PTEM_MINPTEM;
	}

	public Ptemperture(int ID){
		this.ID = ID;
		this.USER_PTEMPERTURE = 0;
        this.PTEM_MAXPTEM = 0;
        this.PTEM_MINPTEM = 0;
        }

	public Ptemperture(){
		this.ID = 0;
        this.USER_PTEMPERTURE = 0;
        this.PTEM_MAXPTEM = 0;
        this.PTEM_MINPTEM = 0;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getUSER_PTEMPERTURE() {
		return USER_PTEMPERTURE;
	}

	public void setUSER_PTEMPERTURE(int USER_PTEMPERTURE) {
		this.USER_PTEMPERTURE = USER_PTEMPERTURE;
	}

	public int getPTEM_MAXPTEM() {
		return PTEM_MAXPTEM;
	}

	public void setPTEM_MAXPTEM(int PTEM_MAXPTEM) {
		this.PTEM_MAXPTEM = PTEM_MAXPTEM;
	}

	public int getPTEM_MINPTEM() {
		return PTEM_MINPTEM;
	}

	public void setPTEM_MINPTEM(int PTEM_MINPTEM) {
		this.PTEM_MINPTEM = PTEM_MINPTEM;
	}
}