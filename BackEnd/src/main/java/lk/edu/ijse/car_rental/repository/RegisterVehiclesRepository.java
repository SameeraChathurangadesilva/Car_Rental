package lk.edu.ijse.car_rental.repository;

import lk.edu.ijse.car_rental.entity.RegisterVehicles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterVehiclesRepository extends JpaRepository<RegisterVehicles,String> {
}
