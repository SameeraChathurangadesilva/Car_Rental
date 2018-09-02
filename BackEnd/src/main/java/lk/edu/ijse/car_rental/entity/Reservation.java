package lk.edu.ijse.car_rental.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reservation {
    @Id
    private String reservationid;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerid",referencedColumnName = "customerid")
    private Customer customer;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<ReservationDetails> reservationDetails;
    private String reservationlocation;
    private String reservationDate;
    private String reservationtime;

    public Reservation() {
    }

    public Reservation(String reservationid, Customer customer, List<ReservationDetails> reservationDetails, String reservationlocation, String reservationDate, String reservationtime) {
        this.reservationid = reservationid;
        this.customer = customer;
        this.reservationDetails = reservationDetails;
        this.reservationlocation = reservationlocation;
        this.reservationDate = reservationDate;
        this.reservationtime = reservationtime;
    }

    public String getReservationid() {
        return reservationid;
    }

    public void setReservationid(String reservationid) {
        this.reservationid = reservationid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ReservationDetails> getReservationDetails() {
        return reservationDetails;
    }

    public void setReservationDetails(List<ReservationDetails> reservationDetails) {
        this.reservationDetails = reservationDetails;
    }

    public String getReservationlocation() {
        return reservationlocation;
    }

    public void setReservationlocation(String reservationlocation) {
        this.reservationlocation = reservationlocation;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationtime() {
        return reservationtime;
    }

    public void setReservationtime(String reservationtime) {
        this.reservationtime = reservationtime;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationid='" + reservationid + '\'' +
                ", customer=" + customer +
                ", reservationDetails=" + reservationDetails +
                ", reservationlocation='" + reservationlocation + '\'' +
                ", reservationDate='" + reservationDate + '\'' +
                ", reservationtime='" + reservationtime + '\'' +
                '}';
    }
}
