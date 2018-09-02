package lk.edu.ijse.car_rental.dto;

public class BrandDTO {

    private String brandid;
    private String brandname;


    public BrandDTO() {
    }

    public BrandDTO(String brandid, String brandname) {
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
}

