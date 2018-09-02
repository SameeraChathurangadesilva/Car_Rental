package lk.edu.ijse.car_rental.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {

    @Id
    private String brandid;
    private String brandname;

    public Brand() {
    }

    public Brand(String brandid, String brandname) {
        this.brandid = brandid;
        this.brandname = brandname;
    }

    public String getBrandid() {
        return brandid;
    }

    public void setBrandid(String brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandid='" + brandid + '\'' +
                ", brandname='" + brandname + '\'' +
                '}';
    }
}
