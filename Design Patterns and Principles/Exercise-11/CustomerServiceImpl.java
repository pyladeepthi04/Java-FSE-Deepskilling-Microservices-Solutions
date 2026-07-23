public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerServiceImpl(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;

    }

    @Override
    public void displayCustomer(int id) {

        System.out.println(customerRepository.findCustomerById(id));

    }

}