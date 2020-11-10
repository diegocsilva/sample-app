package br.com.sampleapp.api.controller;

import br.com.sampleapp.api.dto.CustomerDTO;
import br.com.sampleapp.api.interf.CustomerController;
import br.com.sampleapp.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import javax.validation.Valid;
import java.util.List;

@RequestScope
@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerControllerImpl implements CustomerController {


    private final CustomerService service;

    public CustomerControllerImpl(CustomerService service) {
        this.service = service;
    }

    @Override
    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO save(@Valid CustomerDTO customerDTO) {
        return service.save(customerDTO);
    }

    @Override
    @GetMapping("/name/{name}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerDTO> findAllByName(@PathVariable("name") String name) {
        return service.findAllByName(name);
    }

    @Override
    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO findById(@PathVariable("id") Long id) throws Exception {
        return service.findById(id);
    }

    @Override
    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @PatchMapping("/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO updateName(@PathVariable("id") Long id, @RequestParam("name") String name) throws Exception {
        return service.updateName(id, name);
    }

}
