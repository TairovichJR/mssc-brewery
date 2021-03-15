package guru.springframework.msscbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

    @MockBean
    CustomerService customerService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    CustomerDto validCustomer;

    @Before
    public void setUp(){
        validCustomer = CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .name("Jack Reacher")
                .build();
    }

    @Test
    public void getCustomerById() {

    }

    @Test
    public void handlePost() {
    }

    @Test
    public void updateCustomer() {
    }

    @Test
    public void deleteCustomer() {
    }
}