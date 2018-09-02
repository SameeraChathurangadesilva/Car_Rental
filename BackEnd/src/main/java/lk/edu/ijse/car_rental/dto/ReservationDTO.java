package lk.edu.ijse.car_rental.dto;

import java.util.List;

public class ReservationDTO {

    private String reservationid;
    private CustomerDTO customer;
    private List<ReservationDetailsDTO> reservationDetailsDTOList;
    private String reservationlocation;
    private String reservationDate;
    private String reservationtime;

    public ReservationDTO() {
    }

    public ReservationDTO(String reservationid, CustomerDTO customer, List<ReservationDetailsDTO> reservationDetailsDTOList, String reservationlocation, String reservationDate, String reservationtime) {
        this.reservationid = reservationid;
        this.customer = customer;
        this.reservationDetailsDTOList = reservationDetailsDTOList;
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

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public List<ReservationDetailsDTO> getReservationDetailsDTOList() {
        return reservationDetailsDTOList;
    }

    public void setReservationDetailsDTOList(List<ReservationDetailsDTO> reservationDetailsDTOList) {
        this.reservationDetailsDTOList = reservationDetailsDTOList;
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

}
