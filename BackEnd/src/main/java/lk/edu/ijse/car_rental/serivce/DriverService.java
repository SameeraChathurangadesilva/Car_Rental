package lk.edu.ijse.car_rental.serivce;

import lk.edu.ijse.car_rental.dto.DriverDTO;
import lk.edu.ijse.car_rental.entity.Driver;

import java.util.ArrayList;

public interface DriverService {

    public boolean saveDriver(DriverDTO driverDTO);

    public DriverDTO searchDriver(String Driverid);

    public boolean deleteDriver(String Driverid);

    public ArrayList<DriverDTO> getAll();
}
