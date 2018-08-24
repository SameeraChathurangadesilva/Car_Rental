package lk.edu.ijse.car_rental.dto;

public class AdminDTO {

    private String Adminid;
    private String Adminname;
    private String Adminpassword;
    private String AdminRepassword;

    public AdminDTO() {
    }

    public AdminDTO(String adminid, String adminname, String adminpassword, String adminRepassword) {
        Adminid = adminid;
        Adminname = adminname;
        Adminpassword = adminpassword;
        AdminRepassword = adminRepassword;
    }

    public String getAdminid() {
        return Adminid;
    }

    public void setAdminid(String adminid) {
        Adminid = adminid;
    }

    public String getAdminname() {
        return Adminname;
    }

    public void setAdminname(String adminname) {
        Adminname = adminname;
    }

    public String getAdminpassword() {
        return Adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        Adminpassword = adminpassword;
    }

    public String getAdminRepassword() {
        return AdminRepassword;
    }

    public void setAdminRepassword(String adminRepassword) {
        AdminRepassword = adminRepassword;
    }

    @Override
    public String toString() {
        return "AdminDTO{" +
                "Adminid='" + Adminid + '\'' +
                ", Adminname='" + Adminname + '\'' +
                ", Adminpassword='" + Adminpassword + '\'' +
                ", AdminRepassword='" + AdminRepassword + '\'' +
                '}';
    }
}
