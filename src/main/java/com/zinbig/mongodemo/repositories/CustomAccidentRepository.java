/**
 * Este paquete contiene todas las implementaciones de los repositorios.
 */
package com.zinbig.mongodemo.repositories;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.WeatherCount;

import java.util.List;

public interface CustomAccidentRepository {

	public List<WeatherCount> getCommon();
}
