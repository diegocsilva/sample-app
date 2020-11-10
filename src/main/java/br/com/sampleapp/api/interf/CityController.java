package br.com.sampleapp.api.interf;

import br.com.sampleapp.api.dto.CityDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@Api(tags = "Controller City")
public interface CityController {

    @ApiOperation("Save a new city")
    CityDTO save(CityDTO cityDTO);

    @ApiOperation("Find cities by name")
    List<CityDTO> findAllByName(String name);

    @ApiOperation("Find cities by province")
    List<CityDTO> findAllByProvince(String province);
}
