package lk.edu.ijse.car_rental.dto;

public class DriverDTO {

    private String Driverid;
    private String Drivername;
    private String Driveraddress;
    private String Nicnumber;
    private String Emailaddress;
    private String Telephonenumber;

    public DriverDTO() {
    }

    public DriverDTO(String driverid, String drivername, String driveraddress, String nicnumber, String emailaddress, String telephonenumber) {
        Driverid = driverid;
        Drivername = drivername;
        Driveraddress = driveraddress;
        Nicnumber = nicnumber;
        Emailaddress = emailaddress;
        Telephonenumber = telephonenumber;
    }

    public String getDriverid() {
        return Driverid;
    }

    public void setDriverid(String driverid) {
        Driverid = driverid;
    }

    public String getDrivername() {
        return Drivername;
    }

    public void setDrivername(String drivername) {
        Drivername = drivername;
    }

    public String getDriveraddress() {
        return Driveraddress;
    }

    public void setDriveraddress(String driveraddress) {
        Driveraddress = driveraddress;
    }

    public String getNicnumber() {
        return Nicnumber;
    }

    public void setNicnumber(String nicnumber) {
        Nicnumber = nicnumber;
    }

    public String getEmailaddress() {
        return Emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        Emailaddress = emailaddress;
    }

    public String getTelephonenumber() {
        return Telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        Telephonenumber = telephonenumber;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "Driverid='" + Driverid + '\'' +
                ", Drivername='" + Drivername + '\'' +
                ", Driveraddress='" + Driveraddress + '\'' +
                ", Nicnumber='" + Nicnumber + '\'' +
                ", Emailaddress='" + Emailaddress + '\'' +
                ", Telephonenumber='" + Telephonenumber + '\'' +
                '}';
    }
}
