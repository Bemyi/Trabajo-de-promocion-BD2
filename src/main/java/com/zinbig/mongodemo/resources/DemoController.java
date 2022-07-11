/**
 * Este paquete contiene las clases que definen la api rest de la aplicación.
 */
package com.zinbig.mongodemo.resources;

import javax.inject.Inject;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.User;
import com.zinbig.mongodemo.services.IAccidentService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.zinbig.mongodemo.dtos.UserRequestDTO;
import com.zinbig.mongodemo.services.IUserService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Esta clase presenta los diferentes "endpoints" de la api rest.
 * 
 * @author Javier Bazzocco
 *
 */
@RestController
public class DemoController {

	/**
	 * Es el servicio relacionado con los usuarios.
	 */
	@Inject
	private IUserService usersService;
	@Inject
	private IAccidentService accidentsService;


	/**
	 * Endpoint para crear usuarios.
	 * 
	 * @param anUserRequestDTO dto que contiene la información del usuario a crear.
	 * 
	 */
	@PostMapping("/api/users")
	public void createUser(@RequestBody UserRequestDTO anUserRequestDTO) {
		this.getUsersService().addUser(anUserRequestDTO.name, anUserRequestDTO.username, anUserRequestDTO.password);
	}

	/**
	 * Endpoint para agregar un nuevo número de teléfono.
	 * 
	 * @param anId    es el identificador del usuario.
	 * @param aNumber es el número del teléfono.
	 */
	@PostMapping("/api/users/{id}/{number}")
	public void addPhone(@PathVariable("id") String anId, @PathVariable("number") String aNumber) {
		this.getUsersService().addPhone(anId, aNumber);
	}

	/**
	 * Getter.
	 * 
	 * @return el servicio relacionado con los usuarios.
	 */
	public IUserService getUsersService() {
		return this.usersService;
	}
	public IAccidentService getAccidentsService() {
		return this.accidentsService;
	}

	@GetMapping("/accidents")
	public Accident findById() {
		return this.getAccidentsService().findBySource("anana");
	}

	@GetMapping("/api/users/{anUsername}/{aName}")
	public User findUserX(@PathVariable("anUsername") String anUsername, @PathVariable("aName") String aName) {
		return this.getUsersService().findUserX(anUsername, aName);
	}

	@GetMapping("/get")
	public String hole() {
		return "hole";
	}

	@GetMapping("/accidents/primer/{start}/{end}")
	public List<Accident> findByCity(@PathVariable("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date start, @PathVariable("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date end) {
		return this.getAccidentsService().findByStart_TimeBetween(start, end);
	}

}
