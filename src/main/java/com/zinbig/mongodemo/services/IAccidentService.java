/**
 * Este paquete contiene todas las clases e interfaces que componen la capa de servicios.
 */
package com.zinbig.mongodemo.services;

import com.zinbig.mongodemo.model.Accident;

import java.util.Date;
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

	public Accident findBySource(String anId);

	public List<Accident> findByCity(Date start, Date end);

}
