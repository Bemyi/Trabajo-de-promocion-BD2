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
		return new AccidentDTO(anAccident.getId(), anAccident.getSource(), anAccident.getStart_Time(), anAccident.getEnd_Time(), anAccident.getEnd_Lat(), anAccident.getEnd_Lng(), anAccident.getSide(), anAccident.getCity(), anAccident.getCounty(), anAccident.getState(), anAccident.getZipcode(), anAccident.getCountry(), anAccident.getTimezone(), anAccident.getAirport_Code(), anAccident.getWeather_Timestamp(), anAccident.getWind_Direction(), anAccident.getWeather_Condition(), anAccident.getSunrise_Sunset(), anAccident.getCivil_Twilight(), anAccident.getNautical_Twilight(), anAccident.getAstronomical_Twilight(), anAccident.getDescription(), anAccident.getStreet(), anAccident.getSeverity(), anAccident.getTMC(), anAccident.getStart_Lat(), anAccident.getStart_Lng(), anAccident.getDistance(), anAccident.getNumber(), anAccident.getTemperature(), anAccident.getWind_Chill(), anAccident.getHumidity(), anAccident.getPressure(), anAccident.getVisibility(), anAccident.getWind_Speed(), anAccident.getPrecipitation(), anAccident.getAmenity(), anAccident.getBump(), anAccident.getCrossing(), anAccident.getGive_Way(), anAccident.getJunction(), anAccident.getNo_Exit(), anAccident.getRailway(), anAccident.getRoundabout(), anAccident.getStation(), anAccident.getStop(), anAccident.getTraffic_Calming(), anAccident.getTraffic_Signal(), anAccident.getTurning_Loop());
	}

}
