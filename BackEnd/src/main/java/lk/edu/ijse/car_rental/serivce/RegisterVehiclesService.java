package lk.edu.ijse.car_rental.serivce;

import lk.edu.ijse.car_rental.dto.RegisterVehiclesDTO;
import java.util.ArrayList;

public interface RegisterVehiclesService {

    public boolean saveRegisterVehicles(RegisterVehiclesDTO registerVehiclesDTO);

    public boolean deleteRegisterVehicles(String vehicleId);

    public RegisterVehiclesDTO searchRegisterVehicles(String vehicleId);

    public ArrayList<RegisterVehiclesDTO> getAllRegisterVehicles();
}
