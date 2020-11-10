package br.com.sampleapp.api.controller;

import br.com.sampleapp.api.dto.CityDTO;
import br.com.sampleapp.api.interf.CityController;
import br.com.sampleapp.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import javax.validation.Valid;
import java.util.List;

@RequestScope
@RestController
@RequestMapping("/city")
@Slf4j
public class CityControllerImpl implements CityController {


    private final CityService service;

    public CityControllerImpl(CityService service) {
        this.service = service;
    }

    @Override
    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public CityDTO save(@Valid CityDTO cityDTO) {
        return service.save(cityDTO);
    }

    @Override
    @GetMapping("/name/{name}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<CityDTO> findAllByName(@PathVariable("name") String name) {
        return service.findAllByName(name);
    }

    @Override
    @GetMapping("/province/{province}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<CityDTO> findAllByProvince(@PathVariable("province") String province) {
        return service.findAllByProvince(province);
    }
}
