package lk.edu.ijse.car_rental.serivce;

import lk.edu.ijse.car_rental.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {

    boolean canAuthenticate(String adminName, String adminPassword);

}
