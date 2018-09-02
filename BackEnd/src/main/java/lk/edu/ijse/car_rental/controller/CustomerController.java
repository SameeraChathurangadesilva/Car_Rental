package lk.edu.ijse.car_rental.controller;

import lk.edu.ijse.car_rental.dto.CustomerDTO;
import lk.edu.ijse.car_rental.serivce.CustomerSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerSerive customerSerive;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
        return customerSerive.saveCustomer(customerDTO);
    }

    @DeleteMapping(value = "{customerid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteCustomer(@PathVariable("customerid") String customerid){
        return customerSerive.deleteCustomer(customerid);
    }

    @GetMapping(value = "{customerid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO searchCustomer(@PathVariable("customerid") String customerid){
        return customerSerive.searchCustomer(customerid);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> getAll(){
        return customerSerive.getAll();
    }
}
