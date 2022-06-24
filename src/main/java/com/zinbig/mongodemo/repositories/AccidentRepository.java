/**
 * Este paquete contiene todas las implementaciones de los repositorios.
 */
package com.zinbig.mongodemo.repositories;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Clase que representa el repositorio de usuarios.
 *
 * @author Javier Bazzocco
 *
 */
@Repository
public interface AccidentRepository extends MongoRepository<Accident, String> {

	/**
	 * Recupera un usuario por su nombre y cuenta de usuario.
	 * 
	 * @param anUsername es la cuenta de usuario a buscar.
	 * @param aName      es el nombre del usuario.
	 * @return el usuario hallado o null.
	 */
	@Query("{ID: ?1}")
	public Accident findAccidentByID(String anID);

	@Query("{city: ?0}")
	public List<Accident> findCityX(String aCity);

}
