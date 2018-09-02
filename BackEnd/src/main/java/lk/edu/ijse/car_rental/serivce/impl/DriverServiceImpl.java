package lk.edu.ijse.car_rental.serivce.impl;

import lk.edu.ijse.car_rental.dto.DriverDTO;
import lk.edu.ijse.car_rental.entity.Driver;
import lk.edu.ijse.car_rental.repository.DriverRepository;
import lk.edu.ijse.car_rental.serivce.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveDriver(DriverDTO driverDTO) {

        Driver driver = new Driver(
                driverDTO.getDriverid(),
                driverDTO.getDrivername(),
                driverDTO.getDriveraddress(),
                driverDTO.getNicnumber(),
                driverDTO.getEmailaddress(),
                driverDTO.getTelephonenumber()
        );

        driverRepository.save(driver);
        return true;
    }

    @Override
    public DriverDTO searchDriver(String driverid) {
        Driver driver = driverRepository.findById(driverid).get();
        return new DriverDTO(
                driver.getDriverid(),
                driver.getDrivername(),
                driver.getDriveraddress(),
                driver.getNicnumber(),
                driver.getEmailaddress(),
                driver.getTelephonenumber());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteDriver(String driverid) {
        driverRepository.deleteById(driverid);
        return true;
    }

    @Override
    public ArrayList<DriverDTO> getAll() {

        List<Driver> drivers = driverRepository.findAll();

        ArrayList<DriverDTO> getAll = new ArrayList<>();

        for (Driver driver:drivers) {

            DriverDTO driverDTO =new DriverDTO(
                    driver.getDriverid(),
                    driver.getDrivername(),
                    driver.getDriveraddress(),
                    driver.getNicnumber(),
                    driver.getEmailaddress(),
                    driver.getTelephonenumber()
            );

            getAll.add(driverDTO);
        }
        return getAll;
    }
}
