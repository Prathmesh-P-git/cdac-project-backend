package milk_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import milk_api.entity.CustomerProfile;
import milk_api.repository.CustomerProfileRepository;

@Service
public class CustomerService {

    private final CustomerProfileRepository customerRepository;

    public CustomerService(CustomerProfileRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerProfile> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<CustomerProfile> getCustomerById(String id) {
        return customerRepository.findById(id);
    }

    public CustomerProfile saveCustomer(CustomerProfile customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }
}
