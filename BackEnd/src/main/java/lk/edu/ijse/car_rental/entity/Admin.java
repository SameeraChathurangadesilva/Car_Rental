package lk.edu.ijse.car_rental.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

    @Id
    private String Adminid;
    private String Adminname;
    private String Adminpassword;
    private String AdminRepassword;

    public Admin() {
    }

    public Admin(String adminid, String adminname, String adminpassword, String adminRepassword) {
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
        return "Admin{" +
                "Adminid='" + Adminid + '\'' +
                ", Adminname='" + Adminname + '\'' +
                ", Adminpassword='" + Adminpassword + '\'' +
                ", AdminRepassword='" + AdminRepassword + '\'' +
                '}';
    }
}
