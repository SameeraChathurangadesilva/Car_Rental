package lk.edu.ijse.car_rental.dto;

public class BrandDTO {

    private String Brandid;
    private String Brandname;


    public BrandDTO() {

    }

    public BrandDTO(String brandid, String brandname) {

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
        return "BrandDTO{" +
                "Brandid='" + Brandid + '\'' +
                ", Brandname='" + Brandname + '\'' +
                '}';
    }

}

