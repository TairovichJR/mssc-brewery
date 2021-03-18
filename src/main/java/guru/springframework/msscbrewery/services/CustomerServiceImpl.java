package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .name("Jack Reacher")
                .build();
    }

    @Override
    public CustomerDto saveNewBeer(CustomerDto customerDto) {
        log.debug("saved customer "  + customerDto);
        return CustomerDto.builder()
                .customerId(UUID.randomUUID()).name("John Thompson").build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("updating customer by id " + customerId);
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer by id " + customerId);
    }
}
