/**
 * Este paquete contiene todas las implementaciones de los repositorios.
 */
package com.zinbig.mongodemo.repositories;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
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

	@Query("{Source: ?0}")
	public Accident findAccidentBySource(String aSource);

	@Query("{Start_Time: { $gte: ?0, $lte: ?1 }}")
	public List<Accident> findByStart_TimeBetween(Date aStart, Date aEnd);

	@Query("{Start_Time: ?0}")
	public Accident findAccidentByStart_Time(Date aStart_Time);
}
