package lk.icta.health.poi.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lk.icta.health.poi.dto.ProvinceDto;
import lk.icta.health.poi.entities.Province;
import lk.icta.health.poi.repository.ProvinceRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProvinceServiceBean implements ProvinceService {

	private ProvinceDto convertTODto(Province obj) {
		ProvinceDto dto = new ProvinceDto();
		dto.setId(obj.getId());
		dto.setName(obj.getName());
		return dto;
	}

	private Province convertTOEntity(ProvinceDto dto) {
		Province entity = new Province();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		return entity;
	}

	/**
	 * The Logger for this class.
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * The Spring Data repository for Province entities.
	 */
	@Autowired
	private ProvinceRepository dao;

	/**
	 * Find and return all Provinces
	 * 
	 * @return collection of all Provinces
	 */
	@Override
	public Collection<ProvinceDto> findAll() {
		Collection<Province> objList = dao.findAll();
		Collection<ProvinceDto> returnValue = new ArrayList<>();
		Iterator<Province> itr = objList.iterator();
		while (itr.hasNext()) {
			returnValue.add(convertTODto(itr.next()));
		}
		return returnValue;

	}

	/**
	 * Create a new Province. 
	 * 
	 * @param province
	 *            - new Province
	 * @return - the created Province
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public ProvinceDto createNewAccount(ProvinceDto dto) {
		Province obj = convertTOEntity(dto);
		dao.save(obj);
		return dto;
	}

	@Override
	public ProvinceDto update(ProvinceDto accountDto) {
		Province account = convertTOEntity(accountDto);
		dao.save(account);
		return accountDto;
	}

	@Override
	public ProvinceDto findById(long id) {
		Province obj = dao.findOne(id);
		return convertTODto(obj);
	}
}
