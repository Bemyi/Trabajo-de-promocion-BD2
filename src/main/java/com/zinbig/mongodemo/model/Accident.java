/**
 * Este paquete contiene las clases que representan las entidades del dominio.
 */
package com.zinbig.mongodemo.model;

import org.springframework.data.annotation.Id;

/**
 * Clase que representa a la entidad del usuario.<br>
 * 
 *
 * @author Javier Bazzocco
 *
 */
public class Accident {

	/**
	 * Es el identificador de cada instancia.
	 */
	@Id
	private String id;

	private String source;
	private String start_time;
	private String end_time;
	private String end_lat;
	private String end_lng;
	private String side;
	private String city;
	private String county;
	private String state;
	private String zipcode;
	private String country;
	private String timezone;
	private String airport_code;
	private String weather_timestamp;
	private String wind_direction;
	private String weather_condition;
	private String sunrise_sunset;
	private String civil_twilight;
	private String nautical_twilight;
	private String astronomical_twilight;
	private String description;
	private String street;
	private Integer severity;
	private Float tmc;
	private Float start_lat;
	private Float start_lng;
	private Float distance;
	private Float number;
	private Float temperature;
	private Float wind_chill;
	private Float humidity;
	private Float pressure;
	private Float visibility;
	private Float wind_speed;
	private Float precipitation;
	private Boolean amenity;
	private Boolean bump;
	private Boolean crossing;
	private Boolean give_way;
	private Boolean junction;
	private Boolean no_exit;
	private Boolean railway;
	private Boolean roundabout;
	private Boolean station;
	private Boolean stop;
	private Boolean traffic_calming;
	private Boolean traffic_signal;
	private Boolean turning_loop;

	/**
	 * Constructor. No utilizar.
	 */
	public Accident() {

	}

	public String getId() {
		return id;
	}

	public String getSource() {
		return source;
	}

	public String getStart_time() {
		return start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public String getEnd_lat() {
		return end_lat;
	}

	public String getEnd_lng() {
		return end_lng;
	}

	public String getSide() {
		return side;
	}

	public String getCity() {
		return city;
	}

	public String getCounty() {
		return county;
	}

	public String getState() {
		return state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getCountry() {
		return country;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getAirport_code() {
		return airport_code;
	}

	public String getWeather_timestamp() {
		return weather_timestamp;
	}

	public String getWind_direction() {
		return wind_direction;
	}

	public String getWeather_condition() {
		return weather_condition;
	}

	public String getSunrise_sunset() {
		return sunrise_sunset;
	}

	public String getCivil_twilight() {
		return civil_twilight;
	}

	public String getNautical_twilight() {
		return nautical_twilight;
	}

	public String getAstronomical_twilight() {
		return astronomical_twilight;
	}

	public String getDescription() {
		return description;
	}

	public String getStreet() {
		return street;
	}

	public Integer getSeverity() {
		return severity;
	}

	public Float getTmc() {
		return tmc;
	}

	public Float getStart_lat() {
		return start_lat;
	}

	public Float getStart_lng() {
		return start_lng;
	}

	public Float getDistance() {
		return distance;
	}

	public Float getNumber() {
		return number;
	}

	public Float getTemperature() {
		return temperature;
	}

	public Float getWind_chill() {
		return wind_chill;
	}

	public Float getHumidity() {
		return humidity;
	}

	public Float getPressure() {
		return pressure;
	}

	public Float getVisibility() {
		return visibility;
	}

	public Float getWind_speed() {
		return wind_speed;
	}

	public Float getPrecipitation() {
		return precipitation;
	}

	public Boolean getAmenity() {
		return amenity;
	}

	public Boolean getBump() {
		return bump;
	}

	public Boolean getCrossing() {
		return crossing;
	}

	public Boolean getGive_way() {
		return give_way;
	}

	public Boolean getJunction() {
		return junction;
	}

	public Boolean getNo_exit() {
		return no_exit;
	}

	public Boolean getRailway() {
		return railway;
	}

	public Boolean getRoundabout() {
		return roundabout;
	}

	public Boolean getStation() {
		return station;
	}

	public Boolean getStop() {
		return stop;
	}

	public Boolean getTraffic_calming() {
		return traffic_calming;
	}

	public Boolean getTraffic_signal() {
		return traffic_signal;
	}

	public Boolean getTurning_loop() {
		return turning_loop;
	}
}
