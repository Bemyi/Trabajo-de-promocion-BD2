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

	private String Source;
	private String Start_Time;
	private String End_Time;
	private String End_Lat;
	private String End_Lng;
	private String Side;
	private String City;
	private String County;
	private String State;
	private String Zipcode;
	private String Country;
	private String Timezone;
	private String Airport_Code;
	private String Weather_Timestamp;
	private String Wind_Direction;
	private String Weather_Condition;
	private String Sunrise_Sunset;
	private String Civil_Twilight;
	private String Nautical_Twilight;
	private String Astronomical_Twilight;
	private String Description;
	private String Street;
	private Integer Severity;
	private Float TMC;
	private Float Start_Lat;
	private Float Start_Lng;
	private Float Distance;
	private Float Number;
	private Float Temperature;
	private Float Wind_Chill;
	private Float Humidity;
	private Float Pressure;
	private Float Visibility;
	private Float Wind_Speed;
	private Float Precipitation;
	private Boolean Amenity;
	private Boolean Bump;
	private Boolean Crossing;
	private Boolean Give_Way;
	private Boolean Junction;
	private Boolean No_Exit;
	private Boolean Railway;
	private Boolean Roundabout;
	private Boolean Station;
	private Boolean Stop;
	private Boolean Traffic_Calming;
	private Boolean Traffic_Signal;
	private Boolean Turning_Loop;

	public AccidentRequestDTO(String id, String source, String start_Time, String end_Time, String end_Lat, String end_Lng, String side, String city, String county, String state, String zipcode, String country, String timezone, String airport_Code, String weather_Timestamp, String wind_Direction, String weather_Condition, String sunrise_Sunset, String civil_Twilight, String nautical_Twilight, String astronomical_Twilight, String description, String street, Integer severity, Float TMC, Float start_Lat, Float start_Lng, Float distance, Float number, Float temperature, Float wind_Chill, Float humidity, Float pressure, Float visibility, Float wind_Speed, Float precipitation, Boolean amenity, Boolean bump, Boolean crossing, Boolean give_Way, Boolean junction, Boolean no_Exit, Boolean railway, Boolean roundabout, Boolean station, Boolean stop, Boolean traffic_Calming, Boolean traffic_Signal, Boolean turning_Loop) {
		this.id = id;
		Source = source;
		Start_Time = start_Time;
		End_Time = end_Time;
		End_Lat = end_Lat;
		End_Lng = end_Lng;
		Side = side;
		City = city;
		County = county;
		State = state;
		Zipcode = zipcode;
		Country = country;
		Timezone = timezone;
		Airport_Code = airport_Code;
		Weather_Timestamp = weather_Timestamp;
		Wind_Direction = wind_Direction;
		Weather_Condition = weather_Condition;
		Sunrise_Sunset = sunrise_Sunset;
		Civil_Twilight = civil_Twilight;
		Nautical_Twilight = nautical_Twilight;
		Astronomical_Twilight = astronomical_Twilight;
		Description = description;
		Street = street;
		Severity = severity;
		this.TMC = TMC;
		Start_Lat = start_Lat;
		Start_Lng = start_Lng;
		Distance = distance;
		Number = number;
		Temperature = temperature;
		Wind_Chill = wind_Chill;
		Humidity = humidity;
		Pressure = pressure;
		Visibility = visibility;
		Wind_Speed = wind_Speed;
		Precipitation = precipitation;
		Amenity = amenity;
		Bump = bump;
		Crossing = crossing;
		Give_Way = give_Way;
		Junction = junction;
		No_Exit = no_Exit;
		Railway = railway;
		Roundabout = roundabout;
		Station = station;
		Stop = stop;
		Traffic_Calming = traffic_Calming;
		Traffic_Signal = traffic_Signal;
		Turning_Loop = turning_Loop;
	}
}
