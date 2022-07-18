/**
 * Este paquete contiene las implementaciones de los repositorios personalizados.
 */
package com.zinbig.mongodemo.repositories.impl;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.WeatherCount;
import com.zinbig.mongodemo.repositories.CustomAccidentRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.*;
import java.util.List;

/**
 * Esta clase implementa los mecanismos personalizados de recuperación de
 * información.
 * 
 * @author Javier Bazzocco
 *
 */
public class AccidentRepositoryImpl implements CustomAccidentRepository {

	private MongoTemplate mongoTemplate;

	/**
	 * Obtiene la cantidad de usuarios que tienen la misma clave.
	 * 
	 * @return el número de usuarios.
	 */
	@Override
	public List<WeatherCount> getCommon() {
		GroupOperation groupBy = Aggregation.group("Weather_Condition").count().as("count");
		//MatchOperation filter = Aggregation.match(new Criteria("count").gt(10000000));
		SortOperation sortOperation = Aggregation.sort(Sort.by(Sort.Direction.DESC, "count"));

		Aggregation aggregation = Aggregation.newAggregation(
				groupBy, sortOperation);
		AggregationResults<WeatherCount> result = mongoTemplate.aggregate(aggregation, "accident", WeatherCount.class);
		return result.getMappedResults();
	}

}
