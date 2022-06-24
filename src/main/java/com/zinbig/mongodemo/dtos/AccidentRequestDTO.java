/**
 * Este paquete contiene todos los objetos que se utilizan para representar los pedidos enviados
 * como parte del cuerpo (body).
 */
package com.zinbig.mongodemo.dtos;

/**
 * Las instancias de esta clase se utilizan para representar los datos
 * requeridos para el alta de un usuario.
 * 
 * @author Javier Bazzocco
 *
 */

public class AccidentRequestDTO {

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

	public AccidentRequestDTO(String id, String source, String start_time, String end_time, String end_lat, String end_lng, String side, String city, String county, String state, String zipcode, String country, String timezone, String airport_code, String weather_timestamp, String wind_direction, String weather_condition, String sunrise_sunset, String civil_twilight, String nautical_twilight, String astronomical_twilight, String description, String street, Integer severity, Float tmc, Float start_lat, Float start_lng, Float distance, Float number, Float temperature, Float wind_chill, Float humidity, Float pressure, Float visibility, Float wind_speed, Float precipitation, Boolean amenity, Boolean bump, Boolean crossing, Boolean give_way, Boolean junction, Boolean no_exit, Boolean railway, Boolean roundabout, Boolean station, Boolean stop, Boolean traffic_calming, Boolean traffic_signal, Boolean turning_loop) {
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
}
