package lk.edu.ijse.car_rental.repository;

import lk.edu.ijse.car_rental.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,String> {
}
