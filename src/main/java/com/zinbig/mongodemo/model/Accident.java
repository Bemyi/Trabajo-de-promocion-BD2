/**
 * Este paquete contiene las clases que representan las entidades del dominio.
 */
package com.zinbig.mongodemo.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

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

	private String Source;
	private Date Start_Time;
	private Date End_Time;
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

	public Accident() {

	}

	public Accident(String id, String source, Date start_Time, Date end_Time, String end_Lat, String end_Lng, String side, String city, String county, String state, String zipcode, String country, String timezone, String airport_Code, String weather_Timestamp, String wind_Direction, String weather_Condition, String sunrise_Sunset, String civil_Twilight, String nautical_Twilight, String astronomical_Twilight, String description, String street, Integer severity, Float TMC, Float start_Lat, Float start_Lng, Float distance, Float number, Float temperature, Float wind_Chill, Float humidity, Float pressure, Float visibility, Float wind_Speed, Float precipitation, Boolean amenity, Boolean bump, Boolean crossing, Boolean give_Way, Boolean junction, Boolean no_Exit, Boolean railway, Boolean roundabout, Boolean station, Boolean stop, Boolean traffic_Calming, Boolean traffic_Signal, Boolean turning_Loop) {
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

	public String getId() {
		return id;
	}

	public String getSource() {
		return Source;
	}

	public Date getStart_Time() {
		return Start_Time;
	}

	public Date getEnd_Time() {
		return End_Time;
	}

	public String getEnd_Lat() {
		return End_Lat;
	}

	public String getEnd_Lng() {
		return End_Lng;
	}

	public String getSide() {
		return Side;
	}

	public String getCity() {
		return City;
	}

	public String getCounty() {
		return County;
	}

	public String getState() {
		return State;
	}

	public String getZipcode() {
		return Zipcode;
	}

	public String getCountry() {
		return Country;
	}

	public String getTimezone() {
		return Timezone;
	}

	public String getAirport_Code() {
		return Airport_Code;
	}

	public String getWeather_Timestamp() {
		return Weather_Timestamp;
	}

	public String getWind_Direction() {
		return Wind_Direction;
	}

	public String getWeather_Condition() {
		return Weather_Condition;
	}

	public String getSunrise_Sunset() {
		return Sunrise_Sunset;
	}

	public String getCivil_Twilight() {
		return Civil_Twilight;
	}

	public String getNautical_Twilight() {
		return Nautical_Twilight;
	}

	public String getAstronomical_Twilight() {
		return Astronomical_Twilight;
	}

	public String getDescription() {
		return Description;
	}

	public String getStreet() {
		return Street;
	}

	public Integer getSeverity() {
		return Severity;
	}

	public Float getTMC() {
		return TMC;
	}

	public Float getStart_Lat() {
		return Start_Lat;
	}

	public Float getStart_Lng() {
		return Start_Lng;
	}

	public Float getDistance() {
		return Distance;
	}

	public Float getNumber() {
		return Number;
	}

	public Float getTemperature() {
		return Temperature;
	}

	public Float getWind_Chill() {
		return Wind_Chill;
	}

	public Float getHumidity() {
		return Humidity;
	}

	public Float getPressure() {
		return Pressure;
	}

	public Float getVisibility() {
		return Visibility;
	}

	public Float getWind_Speed() {
		return Wind_Speed;
	}

	public Float getPrecipitation() {
		return Precipitation;
	}

	public Boolean getAmenity() {
		return Amenity;
	}

	public Boolean getBump() {
		return Bump;
	}

	public Boolean getCrossing() {
		return Crossing;
	}

	public Boolean getGive_Way() {
		return Give_Way;
	}

	public Boolean getJunction() {
		return Junction;
	}

	public Boolean getNo_Exit() {
		return No_Exit;
	}

	public Boolean getRailway() {
		return Railway;
	}

	public Boolean getRoundabout() {
		return Roundabout;
	}

	public Boolean getStation() {
		return Station;
	}

	public Boolean getStop() {
		return Stop;
	}

	public Boolean getTraffic_Calming() {
		return Traffic_Calming;
	}

	public Boolean getTraffic_Signal() {
		return Traffic_Signal;
	}

	public Boolean getTurning_Loop() {
		return Turning_Loop;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSource(String source) {
		Source = source;
	}

	public void setStart_Time(Date start_Time) {
		Start_Time = start_Time;
	}

	public void setEnd_Time(Date end_Time) {
		End_Time = end_Time;
	}

	public void setEnd_Lat(String end_Lat) {
		End_Lat = end_Lat;
	}

	public void setEnd_Lng(String end_Lng) {
		End_Lng = end_Lng;
	}

	public void setSide(String side) {
		Side = side;
	}

	public void setCity(String city) {
		City = city;
	}

	public void setCounty(String county) {
		County = county;
	}

	public void setState(String state) {
		State = state;
	}

	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public void setTimezone(String timezone) {
		Timezone = timezone;
	}

	public void setAirport_Code(String airport_Code) {
		Airport_Code = airport_Code;
	}

	public void setWeather_Timestamp(String weather_Timestamp) {
		Weather_Timestamp = weather_Timestamp;
	}

	public void setWind_Direction(String wind_Direction) {
		Wind_Direction = wind_Direction;
	}

	public void setWeather_Condition(String weather_Condition) {
		Weather_Condition = weather_Condition;
	}

	public void setSunrise_Sunset(String sunrise_Sunset) {
		Sunrise_Sunset = sunrise_Sunset;
	}

	public void setCivil_Twilight(String civil_Twilight) {
		Civil_Twilight = civil_Twilight;
	}

	public void setNautical_Twilight(String nautical_Twilight) {
		Nautical_Twilight = nautical_Twilight;
	}

	public void setAstronomical_Twilight(String astronomical_Twilight) {
		Astronomical_Twilight = astronomical_Twilight;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public void setSeverity(Integer severity) {
		Severity = severity;
	}

	public void setTMC(Float TMC) {
		this.TMC = TMC;
	}

	public void setStart_Lat(Float start_Lat) {
		Start_Lat = start_Lat;
	}

	public void setStart_Lng(Float start_Lng) {
		Start_Lng = start_Lng;
	}

	public void setDistance(Float distance) {
		Distance = distance;
	}

	public void setNumber(Float number) {
		Number = number;
	}

	public void setTemperature(Float temperature) {
		Temperature = temperature;
	}

	public void setWind_Chill(Float wind_Chill) {
		Wind_Chill = wind_Chill;
	}

	public void setHumidity(Float humidity) {
		Humidity = humidity;
	}

	public void setPressure(Float pressure) {
		Pressure = pressure;
	}

	public void setVisibility(Float visibility) {
		Visibility = visibility;
	}

	public void setWind_Speed(Float wind_Speed) {
		Wind_Speed = wind_Speed;
	}

	public void setPrecipitation(Float precipitation) {
		Precipitation = precipitation;
	}

	public void setAmenity(Boolean amenity) {
		Amenity = amenity;
	}

	public void setBump(Boolean bump) {
		Bump = bump;
	}

	public void setCrossing(Boolean crossing) {
		Crossing = crossing;
	}

	public void setGive_Way(Boolean give_Way) {
		Give_Way = give_Way;
	}

	public void setJunction(Boolean junction) {
		Junction = junction;
	}

	public void setNo_Exit(Boolean no_Exit) {
		No_Exit = no_Exit;
	}

	public void setRailway(Boolean railway) {
		Railway = railway;
	}

	public void setRoundabout(Boolean roundabout) {
		Roundabout = roundabout;
	}

	public void setStation(Boolean station) {
		Station = station;
	}

	public void setStop(Boolean stop) {
		Stop = stop;
	}

	public void setTraffic_Calming(Boolean traffic_Calming) {
		Traffic_Calming = traffic_Calming;
	}

	public void setTraffic_Signal(Boolean traffic_Signal) {
		Traffic_Signal = traffic_Signal;
	}

	public void setTurning_Loop(Boolean turning_Loop) {
		Turning_Loop = turning_Loop;
	}
}
