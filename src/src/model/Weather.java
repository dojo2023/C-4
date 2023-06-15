/**
 *
 */
package model;

import java.io.Serializable;

/**
 * @author user
 *
 */
public class Weather implements Serializable{
		private int ID;
		private int DAY_WEATHERCODE;
		private String WEATHER_IMAGE;
		private String WEATHER_EXPRESSION;

		public Weather(int ID,int DAY_WEATHERCODE, String WEATHER_IMAGE, String WEATHER_EXPRESSION){
			this.ID = ID;
			this.DAY_WEATHERCODE = DAY_WEATHERCODE;
			this.WEATHER_IMAGE = WEATHER_IMAGE;
			this.WEATHER_EXPRESSION = WEATHER_EXPRESSION;
		}


		public Weather(int ID){
			this.ID = ID;
			this.DAY_WEATHERCODE = 100;
			this.WEATHER_IMAGE ="" ;
	        this.WEATHER_EXPRESSION = "";
            }

		public int getID() {
			return ID;
		}

		public void setID(int ID) {
			this.ID = ID;
		}

		public int getDAY_WEATHERCODE() {
			return DAY_WEATHERCODE;
		}

		public void setDAY_WEATHERCODE(int DAY_WEATHERCODE) {
			this.DAY_WEATHERCODE = DAY_WEATHERCODE;
		}

		public String getWEATHER_IMAGE() {
			return WEATHER_IMAGE;
		}

		public void setWEATHER_IMAGE(String WEATHER_IMAGE) {
			this.WEATHER_IMAGE = WEATHER_IMAGE;
		}

		public String getWEATHER_EXPRESSION() {
			return WEATHER_EXPRESSION;
		}

		public void setWEATHER_EXPRESSION(String WEATHER_EXPRESSION) {
			this.WEATHER_EXPRESSION = WEATHER_EXPRESSION;
		}




}
