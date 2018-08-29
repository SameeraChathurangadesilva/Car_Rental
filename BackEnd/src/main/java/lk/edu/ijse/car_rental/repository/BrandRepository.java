package lk.edu.ijse.car_rental.repository;

import lk.edu.ijse.car_rental.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,String> {
}
