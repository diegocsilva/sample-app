package br.com.sampleapp.repository;

import br.com.sampleapp.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    List<City> findAllByNameLike(String name);

    List<City> findAllByProvince(String name);
}
