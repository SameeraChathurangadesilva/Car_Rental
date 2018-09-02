package lk.edu.ijse.car_rental.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private String customerid;
    private String title;
    private String customername;
    private String customeraddress;
    private String customernicnumber;
    private String customerEmailaddress;
    private String customerTelephonenumber;

    public Customer() {
    }

    public Customer(String customerid, String title, String customername, String customeraddress, String customernicnumber, String customerEmailaddress, String customerTelephonenumber) {
        this.customerid = customerid;
        this.title = title;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.customernicnumber = customernicnumber;
        this.customerEmailaddress = customerEmailaddress;
        this.customerTelephonenumber = customerTelephonenumber;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public String getCustomernicnumber() {
        return customernicnumber;
    }

    public void setCustomernicnumber(String customernicnumber) {
        this.customernicnumber = customernicnumber;
    }

    public String getCustomerEmailaddress() {
        return customerEmailaddress;
    }

    public void setCustomerEmailaddress(String customerEmailaddress) {
        this.customerEmailaddress = customerEmailaddress;
    }

    public String getCustomerTelephonenumber() {
        return customerTelephonenumber;
    }

    public void setCustomerTelephonenumber(String customerTelephonenumber) {
        this.customerTelephonenumber = customerTelephonenumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerid='" + customerid + '\'' +
                ", title='" + title + '\'' +
                ", customername='" + customername + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", customernicnumber='" + customernicnumber + '\'' +
                ", customerEmailaddress='" + customerEmailaddress + '\'' +
                ", customerTelephonenumber='" + customerTelephonenumber + '\'' +
                '}';
    }
}
