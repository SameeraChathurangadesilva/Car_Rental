package lk.edu.ijse.car_rental.repository;

import lk.edu.ijse.car_rental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
