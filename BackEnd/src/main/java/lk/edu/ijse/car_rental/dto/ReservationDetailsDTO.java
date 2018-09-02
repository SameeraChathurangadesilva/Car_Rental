package lk.edu.ijse.car_rental.dto;

public class ReservationDetailsDTO {

    private String reservationdetailsid;
    private RegisterVehiclesDTO registerVehiclesDTO;
    private ReservationDTO reservationDTO;
    private DriverDTO driverDTO;

    public ReservationDetailsDTO() {
    }

    public ReservationDetailsDTO(String reservationdetailsid, RegisterVehiclesDTO registerVehiclesDTO, ReservationDTO reservationDTO, DriverDTO driverDTO) {
        this.reservationdetailsid = reservationdetailsid;
        this.registerVehiclesDTO = registerVehiclesDTO;
        this.reservationDTO = reservationDTO;
        this.driverDTO = driverDTO;
    }

    public String getReservationdetailsid() {
        return reservationdetailsid;
    }

    public void setReservationdetailsid(String reservationdetailsid) {
        this.reservationdetailsid = reservationdetailsid;
    }

    public RegisterVehiclesDTO getRegisterVehiclesDTO() {
        return registerVehiclesDTO;
    }

    public void setRegisterVehiclesDTO(RegisterVehiclesDTO registerVehiclesDTO) {
        this.registerVehiclesDTO = registerVehiclesDTO;
    }

    public ReservationDTO getReservationDTO() {
        return reservationDTO;
    }

    public void setReservationDTO(ReservationDTO reservationDTO) {
        this.reservationDTO = reservationDTO;
    }

    public DriverDTO getDriverDTO() {
        return driverDTO;
    }

    public void setDriverDTO(DriverDTO driverDTO) {
        this.driverDTO = driverDTO;
    }
}
