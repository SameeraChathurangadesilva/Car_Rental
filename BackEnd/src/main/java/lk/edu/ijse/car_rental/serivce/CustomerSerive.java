package lk.edu.ijse.car_rental.serivce;

import lk.edu.ijse.car_rental.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerSerive {

    public boolean saveCustomer(CustomerDTO  customerDTO);

    public boolean deleteCustomer(String customerid);

    public CustomerDTO searchCustomer(String customerid);

    public ArrayList<CustomerDTO> getAll();
}
