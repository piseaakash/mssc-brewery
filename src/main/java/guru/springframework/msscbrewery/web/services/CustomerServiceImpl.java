package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	public CustomerDto getCustomerById(UUID id) {
		return CustomerDto.builder().id(UUID.randomUUID())
				.name("Aakash")
				.build();
	}

	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		log.debug("updating a customer..");
		
	}

	public void deleteCustomerById(UUID customerId) {
		log.debug("Deleting a customer..");
		
	}

}
