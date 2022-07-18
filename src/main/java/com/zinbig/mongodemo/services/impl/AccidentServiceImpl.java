/**
 * Este paquete contiene las implementaciones de los servicios.
 */
package com.zinbig.mongodemo.services.impl;

import com.zinbig.mongodemo.dtos.DTOFactory;
import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.WeatherCount;
import com.zinbig.mongodemo.repositories.AccidentRepository;
import com.zinbig.mongodemo.services.IAccidentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Esta clase contiene la implementación de los servicios relacionados con los
 * usuarios.
 * 
 * @author Javier Bazzocco
 *
 */
@Service
@Transactional
public class AccidentServiceImpl implements IAccidentService {

	/**
	 * Es el repositorio ligado a los usuarios.
	 */
	@Inject
	private AccidentRepository accidentRepository;

	/**
	 * Es el objeto encargado de crear los DTOs.
	 */
	@Inject
	private DTOFactory dtoFactory;


	@Override
	public Accident findBySource(String anId) {
		return this.accidentRepository.findAccidentBySource(anId);
	}

	@Override
	public List<Accident> findByStart_TimeBetween(Date start, Date end) {
		return this.accidentRepository.findByStart_TimeBetween(start, end);
	}

	@Override
	public Accident findAccidentByStart_Time(Date start){
		return this.accidentRepository.findAccidentByStart_Time(start);
	}

	@Override
	public List<WeatherCount> getCommon(){
		return this.accidentRepository.getCommon();
	}
}
