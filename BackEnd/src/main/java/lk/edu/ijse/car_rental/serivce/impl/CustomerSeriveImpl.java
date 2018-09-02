package lk.edu.ijse.car_rental.serivce.impl;

import lk.edu.ijse.car_rental.dto.CustomerDTO;
import lk.edu.ijse.car_rental.entity.Customer;
import lk.edu.ijse.car_rental.repository.CustomerRepository;
import lk.edu.ijse.car_rental.serivce.CustomerSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerSeriveImpl implements CustomerSerive {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveCustomer(CustomerDTO customerDTO) {

        Customer customer = new Customer(
                customerDTO.getCustomerid(),
                customerDTO.getTitle(),
                customerDTO.getCustomername(),
                customerDTO.getCustomeraddress(),
                customerDTO.getCustomernicnumber(),
                customerDTO.getCustomerEmailaddress(),
                customerDTO.getCustomerTelephonenumber()
        );

        customerRepository.save(customer);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteCustomer(String customerid) {
        customerRepository.deleteById(customerid);
        return true;
    }

    @Override
    public CustomerDTO searchCustomer(String customerid) {

        Customer customer = customerRepository.findById(customerid).get();
        return new CustomerDTO(
                customer.getCustomerid(),
                customer.getTitle(),
                customer.getCustomername(),
                customer.getCustomeraddress(),
                customer.getCustomernicnumber(),
                customer.getCustomerEmailaddress(),
                customer.getCustomerTelephonenumber()
        );
    }

    @Override
    public ArrayList<CustomerDTO> getAll() {

        List<Customer> customers = customerRepository.findAll();

        ArrayList<CustomerDTO> customerList = new ArrayList<>();

        for (Customer customer : customers) {

            CustomerDTO customerDTO = new CustomerDTO(

                    customer.getCustomerid(),
                    customer.getTitle(),
                    customer.getCustomername(),
                    customer.getCustomeraddress(),
                    customer.getCustomernicnumber(),
                    customer.getCustomerEmailaddress(),
                    customer.getCustomerTelephonenumber()
            );
            customerList.add(customerDTO);
        }
        return customerList;
    }
}
