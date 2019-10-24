package lk.icta.health.poi.service;

import java.util.Collection;

import lk.icta.health.poi.dto.ProvinceDto;


public interface ProvinceService {

	public Collection<ProvinceDto> findAll();

	public ProvinceDto findById(long id);

	public ProvinceDto createNewAccount(ProvinceDto dto);

	public ProvinceDto update(ProvinceDto dto);

}
