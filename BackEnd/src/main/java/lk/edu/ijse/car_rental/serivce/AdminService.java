package lk.edu.ijse.car_rental.serivce;

import lk.edu.ijse.car_rental.dto.AdminDTO;
import java.util.ArrayList;

public interface AdminService {

    public boolean saveAdmin(AdminDTO adminDTO);

    public boolean deleteAdmin(String Adminid);

    public AdminDTO searchAdmin(String Adminid);

    public ArrayList<AdminDTO> getAll();
}
