package lk.edu.ijse.car_rental.repository;

import lk.edu.ijse.car_rental.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository  extends JpaRepository<Admin,String> {

}
