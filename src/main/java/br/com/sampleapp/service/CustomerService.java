package br.com.sampleapp.service;

import br.com.sampleapp.api.dto.CustomerDTO;
import br.com.sampleapp.entity.Customer;
import br.com.sampleapp.mapper.Mappable;
import br.com.sampleapp.repository.CustomerRepository;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
public class CustomerService implements Mappable {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }


    public CustomerDTO save(CustomerDTO customerDTO) {
        var customer = map(customerDTO, Customer.class);
        var saved = repository.save(customer);
        return map(saved, CustomerDTO.class);
    }

    public List<CustomerDTO> findAllByName(String name) {
        List<Customer> customers = repository.findAllByNameLike(name);
        return map(customers, CustomerDTO.class);
    }

    public CustomerDTO findById(Long id) throws Exception {
        Customer customer = repository.findById(id).orElseThrow(makeNotFoundException());
        return map(customer, CustomerDTO.class);
    }

    public void delete(Long id) throws Exception {
        Customer customer = repository.findById(id).orElseThrow(makeNotFoundException());
        repository.delete(customer);
    }

    public CustomerDTO updateName(Long id, String name) throws Exception {
        Customer customer = repository.findById(id).orElseThrow(makeNotFoundException());
        customer.setName(name);
        var saved = repository.save(customer);
        return map(saved, CustomerDTO.class);
    }

    private Supplier<Exception> makeNotFoundException() {
        return () -> new Exception("Cliente inv\u00E1lido!");
    }

}
