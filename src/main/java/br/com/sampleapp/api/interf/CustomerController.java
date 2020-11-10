package br.com.sampleapp.api.interf;

import br.com.sampleapp.api.dto.CustomerDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api(tags = "Controller Customer")
public interface CustomerController {

    @ApiOperation("Save a new customer")
    CustomerDTO save(CustomerDTO customerDTO);

    @ApiOperation("Find cities by name")
    List<CustomerDTO> findAllByName(String name);

    @ApiOperation("Find customer by id")
    CustomerDTO findById(Long id) throws Exception;

    @ApiOperation("Delete customer by id")
    ResponseEntity<Void> delete(Long id) throws Exception;

    @ApiOperation("Update customer name")
    CustomerDTO updateName(Long id, String name) throws Exception;

}
