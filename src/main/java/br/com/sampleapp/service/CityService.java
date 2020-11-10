package br.com.sampleapp.service;

import br.com.sampleapp.api.dto.CityDTO;
import br.com.sampleapp.entity.City;
import br.com.sampleapp.mapper.Mappable;
import br.com.sampleapp.repository.CityRepository;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements Mappable {

    private final CityRepository repository;

    public CityService(CityRepository repository) {
        this.repository = repository;
    }

    public CityDTO save(CityDTO cityDTO) {
        var city = map(cityDTO, City.class);
        City saved = repository.save(city);
        return map(saved, CityDTO.class);
    }

    public List<CityDTO> findAllByName(String name) {
        List<City> cities = repository.findAllByNameLike(name);
        return map(cities, CityDTO.class);
    }

    public List<CityDTO> findAllByProvince(String province) {
        List<City> cities = repository.findAllByProvince(province);
        return map(cities, CityDTO.class);
    }


}
