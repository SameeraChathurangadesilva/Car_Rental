package lk.edu.ijse.car_rental.entity;

import javax.persistence.*;

@Entity
public class ReservationDetails {

    @Id
    private String reservationdetailsid;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicleId",referencedColumnName = "vehicleId")
    private RegisterVehicles registerVehicles;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reservationid",referencedColumnName = "reservationid")
    private Reservation reservation;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Driverid",referencedColumnName = "Driverid")
    private Driver driver;

    public ReservationDetails() {
    }


    public ReservationDetails(String reservationdetailsid, RegisterVehicles registerVehicles, Reservation reservation, Driver driver) {
        this.reservationdetailsid = reservationdetailsid;
        this.registerVehicles = registerVehicles;
        this.reservation = reservation;
        this.driver = driver;
    }

    public String getReservationdetailsid() {
        return reservationdetailsid;
    }

    public void setReservationdetailsid(String reservationdetailsid) {
        this.reservationdetailsid = reservationdetailsid;
    }

    public RegisterVehicles getRegisterVehicles() {
        return registerVehicles;
    }

    public void setRegisterVehicles(RegisterVehicles registerVehicles) {
        this.registerVehicles = registerVehicles;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "ReservationDetails{" +
                "reservationdetailsid='" + reservationdetailsid + '\'' +
                ", registerVehicles=" + registerVehicles +
                ", reservation=" + reservation +
                ", driver=" + driver +
                '}';
    }
}
