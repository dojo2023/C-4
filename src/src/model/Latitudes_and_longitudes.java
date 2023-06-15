package model;

import java.io.Serializable;

public class Latitudes_and_longitudes implements Serializable {
	private int ID;
	private String HOME;
	private double LATITUDE;
	private double LONGITUDE;

	public Latitudes_and_longitudes(int ID, String HOME, double LATITUDE, double LONGITUDE){
		this.ID = ID;
		this.HOME = HOME;
		this.LATITUDE = LATITUDE;
	    this.LONGITUDE = LONGITUDE;
	}

	public Latitudes_and_longitudes(int ID){
		this.ID = ID;
		this.HOME = "";
        this.LATITUDE = 0;
        this.LONGITUDE = 0;
        }

	public Latitudes_and_longitudes(){
		this.ID = 0;
        this.HOME = "";
        this.LATITUDE = 0;
        this.LONGITUDE = 0;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getHOME() {
		return HOME;
	}

	public void setHOME(String HOME) {
		this.HOME = HOME;
	}

	public double getLATITUDE() {
		return LATITUDE;
	}

	public void setLATITUDE(double LATITUDE) {
		this.LATITUDE = LATITUDE;
	}

	public double getLONGITUDE() {
		return LONGITUDE;
	}

	public void setLONGITUDE(double LONGITUDE) {
		this.LONGITUDE = LONGITUDE;
	}

}


