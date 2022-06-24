/**
 * Este paquete contiene las clases que se utilizan para transferir información de las 
 * distintas instancias entre capas.
 */
package com.zinbig.mongodemo.dtos;

import org.springframework.data.annotation.Id;

/**
 * Las instancias de esta clase se utilizan para transferir información de los
 * usuarios.
 * 
 * @author Javier Bazzocco
 *
 */
public class AccidentDTO {

	/**
	 * Es el identificador de cada instancia.
	 */
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

	public AccidentDTO(String id, String source, String start_time, String end_time, String end_lat, String end_lng, String side, String city, String county, String state, String zipcode, String country, String timezone, String airport_code, String weather_timestamp, String wind_direction, String weather_condition, String sunrise_sunset, String civil_twilight, String nautical_twilight, String astronomical_twilight, String description, String street, Integer severity, Float tmc, Float start_lat, Float start_lng, Float distance, Float number, Float temperature, Float wind_chill, Float humidity, Float pressure, Float visibility, Float wind_speed, Float precipitation, Boolean amenity, Boolean bump, Boolean crossing, Boolean give_way, Boolean junction, Boolean no_exit, Boolean railway, Boolean roundabout, Boolean station, Boolean stop, Boolean traffic_calming, Boolean traffic_signal, Boolean turning_loop) {
		this.id = id;
		this.source = source;
		this.start_time = start_time;
		this.end_time = end_time;
		this.end_lat = end_lat;
		this.end_lng = end_lng;
		this.side = side;
		this.city = city;
		this.county = county;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.timezone = timezone;
		this.airport_code = airport_code;
		this.weather_timestamp = weather_timestamp;
		this.wind_direction = wind_direction;
		this.weather_condition = weather_condition;
		this.sunrise_sunset = sunrise_sunset;
		this.civil_twilight = civil_twilight;
		this.nautical_twilight = nautical_twilight;
		this.astronomical_twilight = astronomical_twilight;
		this.description = description;
		this.street = street;
		this.severity = severity;
		this.tmc = tmc;
		this.start_lat = start_lat;
		this.start_lng = start_lng;
		this.distance = distance;
		this.number = number;
		this.temperature = temperature;
		this.wind_chill = wind_chill;
		this.humidity = humidity;
		this.pressure = pressure;
		this.visibility = visibility;
		this.wind_speed = wind_speed;
		this.precipitation = precipitation;
		this.amenity = amenity;
		this.bump = bump;
		this.crossing = crossing;
		this.give_way = give_way;
		this.junction = junction;
		this.no_exit = no_exit;
		this.railway = railway;
		this.roundabout = roundabout;
		this.station = station;
		this.stop = stop;
		this.traffic_calming = traffic_calming;
		this.traffic_signal = traffic_signal;
		this.turning_loop = turning_loop;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public void setEnd_lat(String end_lat) {
		this.end_lat = end_lat;
	}

	public void setEnd_lng(String end_lng) {
		this.end_lng = end_lng;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public void setAirport_code(String airport_code) {
		this.airport_code = airport_code;
	}

	public void setWeather_timestamp(String weather_timestamp) {
		this.weather_timestamp = weather_timestamp;
	}

	public void setWind_direction(String wind_direction) {
		this.wind_direction = wind_direction;
	}

	public void setWeather_condition(String weather_condition) {
		this.weather_condition = weather_condition;
	}

	public void setSunrise_sunset(String sunrise_sunset) {
		this.sunrise_sunset = sunrise_sunset;
	}

	public void setCivil_twilight(String civil_twilight) {
		this.civil_twilight = civil_twilight;
	}

	public void setNautical_twilight(String nautical_twilight) {
		this.nautical_twilight = nautical_twilight;
	}

	public void setAstronomical_twilight(String astronomical_twilight) {
		this.astronomical_twilight = astronomical_twilight;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setSeverity(Integer severity) {
		this.severity = severity;
	}

	public void setTmc(Float tmc) {
		this.tmc = tmc;
	}

	public void setStart_lat(Float start_lat) {
		this.start_lat = start_lat;
	}

	public void setStart_lng(Float start_lng) {
		this.start_lng = start_lng;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public void setNumber(Float number) {
		this.number = number;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	public void setWind_chill(Float wind_chill) {
		this.wind_chill = wind_chill;
	}

	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}

	public void setPressure(Float pressure) {
		this.pressure = pressure;
	}

	public void setVisibility(Float visibility) {
		this.visibility = visibility;
	}

	public void setWind_speed(Float wind_speed) {
		this.wind_speed = wind_speed;
	}

	public void setPrecipitation(Float precipitation) {
		this.precipitation = precipitation;
	}

	public void setAmenity(Boolean amenity) {
		this.amenity = amenity;
	}

	public void setBump(Boolean bump) {
		this.bump = bump;
	}

	public void setCrossing(Boolean crossing) {
		this.crossing = crossing;
	}

	public void setGive_way(Boolean give_way) {
		this.give_way = give_way;
	}

	public void setJunction(Boolean junction) {
		this.junction = junction;
	}

	public void setNo_exit(Boolean no_exit) {
		this.no_exit = no_exit;
	}

	public void setRailway(Boolean railway) {
		this.railway = railway;
	}

	public void setRoundabout(Boolean roundabout) {
		this.roundabout = roundabout;
	}

	public void setStation(Boolean station) {
		this.station = station;
	}

	public void setStop(Boolean stop) {
		this.stop = stop;
	}

	public void setTraffic_calming(Boolean traffic_calming) {
		this.traffic_calming = traffic_calming;
	}

	public void setTraffic_signal(Boolean traffic_signal) {
		this.traffic_signal = traffic_signal;
	}

	public void setTurning_loop(Boolean turning_loop) {
		this.turning_loop = turning_loop;
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
