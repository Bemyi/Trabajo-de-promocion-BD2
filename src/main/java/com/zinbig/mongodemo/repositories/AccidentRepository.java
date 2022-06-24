/**
 * Este paquete contiene todas las implementaciones de los repositorios.
 */
package com.zinbig.mongodemo.repositories;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Clase que representa el repositorio de usuarios.
 *
 * @author Javier Bazzocco
 *
 */
@Repository
public interface AccidentRepository extends MongoRepository<User, String> {

	/**
	 * Recupera un usuario por su nombre y cuenta de usuario.
	 * 
	 * @param anUsername es la cuenta de usuario a buscar.
	 * @param aName      es el nombre del usuario.
	 * @return el usuario hallado o null.
	 */
	//@Query("{name: ?1, username:?0}")
	//public User findUserX(String anUsername, String aName);

}
