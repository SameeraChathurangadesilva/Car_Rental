package lk.edu.ijse.car_rental.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private String Customerid;
    private String Customername;
    private String Customeraddress;
    private String Customernicnumber;
    private String CustomerEmailaddress;
    private String CustomerTelephonenumber;

}
