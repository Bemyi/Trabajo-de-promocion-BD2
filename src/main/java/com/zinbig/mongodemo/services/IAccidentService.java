/**
 * Este paquete contiene todas las clases e interfaces que componen la capa de servicios.
 */
package com.zinbig.mongodemo.services;

import com.zinbig.mongodemo.model.Accident;

import java.util.List;
import java.util.Optional;

/**
 * Esta interface define el comportamiento esperado por los servicios
 * relacionados con los accidentes.
 * 
 * @author Javier Bazzocco
 *
 */
public interface IAccidentService {

	public Accident findById(String anId);

	public List<Accident> findByCity(String aCity);

}
