/**
 * Este paquete contiene las clases que se utilizan para transferir información de las 
 * distintas instancias entre capas.
 */
package com.zinbig.mongodemo.dtos;

import com.zinbig.mongodemo.model.Accident;
import org.springframework.stereotype.Component;

import com.zinbig.mongodemo.model.User;

/**
 * Las instancias de esta clase se utilizan para crear DTOs en forma
 * centralizada.
 * 
 * @author Javier Bazzocco
 *
 */
@Component
public class DTOFactory {

	/**
	 * Crea un DTO que representará a un usuario.
	 * 
	 * @param anUser es el usuario que debe ser representado.
	 * @return un DTO con los datos básicos.
	 */
	public UserDTO createUserDTO(User anUser) {
		return new UserDTO(anUser.getId(), anUser.getUsername(), anUser.getName(), anUser.version);
	}

	public AccidentDTO createAccidentDTO(Accident anAccident) {
		return new AccidentDTO(anAccident.getId(), anAccident.getSource(), anAccident.getStart_time(), anAccident.getEnd_time(), anAccident.getEnd_lat(), anAccident.getEnd_lng(), anAccident.getSide(), anAccident.getCity(), anAccident.getCounty(), anAccident.getState(), anAccident.getZipcode(), anAccident.getCountry(), anAccident.getTimezone(), anAccident.getAirport_code(), anAccident.getWeather_timestamp(), anAccident.getWind_direction(), anAccident.getWeather_condition(), anAccident.getSunrise_sunset(), anAccident.getCivil_twilight(), anAccident.getNautical_twilight(), anAccident.getAstronomical_twilight(), anAccident.getDescription(), anAccident.getStreet(), anAccident.getSeverity(), anAccident.getTmc(), anAccident.getStart_lat(), anAccident.getStart_lng(), anAccident.getDistance(), anAccident.getNumber(), anAccident.getTemperature(), anAccident.getWind_chill(), anAccident.getHumidity(), anAccident.getPressure(), anAccident.getVisibility(), anAccident.getWind_speed(), anAccident.getPrecipitation(), anAccident.getAmenity(), anAccident.getBump(), anAccident.getCrossing(), anAccident.getGive_way(), anAccident.getJunction(), anAccident.getNo_exit(), anAccident.getRailway(), anAccident.getRoundabout(), anAccident.getStation(), anAccident.getStop(), anAccident.getTraffic_calming(), anAccident.getTraffic_signal(), anAccident.getTurning_loop());
	}

}
