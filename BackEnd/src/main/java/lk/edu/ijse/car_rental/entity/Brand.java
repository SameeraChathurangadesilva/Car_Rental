package lk.edu.ijse.car_rental.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {

    @Id
    private String Brandid;
    private String Brandname;

    public Brand() {
    }

    public Brand(String brandid, String brandname) {
        Brandid = brandid;
        Brandname = brandname;
    }

    public String getBrandid() {
        return Brandid;
    }

    public void setBrandid(String brandid) {
        Brandid = brandid;
    }

    public String getBrandname() {
        return Brandname;
    }

    public void setBrandname(String brandname) {
        Brandname = brandname;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "Brandid='" + Brandid + '\'' +
                ", Brandname='" + Brandname + '\'' +
                '}';
    }

}
