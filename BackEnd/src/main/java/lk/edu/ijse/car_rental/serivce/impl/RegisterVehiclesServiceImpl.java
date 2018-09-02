package lk.edu.ijse.car_rental.serivce.impl;

import lk.edu.ijse.car_rental.dto.BrandDTO;
import lk.edu.ijse.car_rental.dto.RegisterVehiclesDTO;
import lk.edu.ijse.car_rental.entity.Brand;
import lk.edu.ijse.car_rental.entity.RegisterVehicles;
import lk.edu.ijse.car_rental.repository.RegisterVehiclesRepository;
import lk.edu.ijse.car_rental.serivce.RegisterVehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RegisterVehiclesServiceImpl implements RegisterVehiclesService {

    @Autowired
    private RegisterVehiclesRepository registerVehiclesRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveRegisterVehicles(RegisterVehiclesDTO registerVehiclesDTO) {

        RegisterVehicles vehicles = new RegisterVehicles(
                registerVehiclesDTO.getVehicleId(),
                registerVehiclesDTO.getVehicleTitle(),
                new Brand(registerVehiclesDTO.getBrandDTO().getBrandid(), registerVehiclesDTO.getBrandDTO().getBrandname()),
                registerVehiclesDTO.getVehicleOverView(),
                registerVehiclesDTO.getVehiclePricePerDay(),
                registerVehiclesDTO.getVehicleModelyear(),
                registerVehiclesDTO.getVehicleFuelType(),
                registerVehiclesDTO.getVehicleEngineCapacity(),
                registerVehiclesDTO.getVehicleSeatingCapacity(),
                registerVehiclesDTO.getVehicleAirConditioner(),
                registerVehiclesDTO.getVehiclePowerDoorLocks(),
                registerVehiclesDTO.getVehicleAntiLockBrakingSystem(),
                registerVehiclesDTO.getVehicleBrakeAssist(),
                registerVehiclesDTO.getVehiclePowerSteering(),
                registerVehiclesDTO.getVehicleDriverAirbag(),
                registerVehiclesDTO.getVehiclePassengerAirbag(),
                registerVehiclesDTO.getVehiclePowerWindows(),
                registerVehiclesDTO.getVehicleCDPlayer(),
                registerVehiclesDTO.getVehicleCentralLocking(),
                registerVehiclesDTO.getVehicleCrashSensor(),
                registerVehiclesDTO.getVehicleLeatherSeats()
        );

        registerVehiclesRepository.save(vehicles);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteRegisterVehicles(String vehicleId) {
        registerVehiclesRepository.deleteById(vehicleId);
        return true;
    }

    @Override
    public RegisterVehiclesDTO searchRegisterVehicles(String vehicleId) {
        RegisterVehicles vehicles = registerVehiclesRepository.findById(vehicleId).get();
        return new RegisterVehiclesDTO(
                vehicles.getVehicleId(),
                vehicles.getVehicleTitle(),
                new BrandDTO(vehicles.getBrand().getBrandid(), vehicles.getBrand().getBrandname()),
                vehicles.getVehicleOverView(),
                vehicles.getVehiclePricePerDay(),
                vehicles.getVehicleModelyear(),
                vehicles.getVehicleFuelType(),
                vehicles.getVehicleEngineCapacity(),
                vehicles.getVehicleSeatingCapacity(),
                vehicles.getVehicleAirConditioner(),
                vehicles.getVehiclePowerDoorLocks(),
                vehicles.getVehicleAntiLockBrakingSystem(),
                vehicles.getVehicleBrakeAssist(),
                vehicles.getVehiclePowerSteering(),
                vehicles.getVehicleDriverAirbag(),
                vehicles.getVehiclePassengerAirbag(),
                vehicles.getVehiclePowerWindows(),
                vehicles.getVehicleCDPlayer(),
                vehicles.getVehicleCentralLocking(),
                vehicles.getVehicleCrashSensor(),
                vehicles.getVehicleLeatherSeats()
        );
    }

    @Override
    public ArrayList<RegisterVehiclesDTO> getAllRegisterVehicles() {

        List<RegisterVehicles> vehiclesList = registerVehiclesRepository.findAll();

        ArrayList<RegisterVehiclesDTO> registerVehiclesDTOS = new ArrayList<>();

        for (RegisterVehicles vehicles : vehiclesList) {

            RegisterVehiclesDTO registerVehicles = new RegisterVehiclesDTO(
                    vehicles.getVehicleId(),
                    vehicles.getVehicleTitle(),
                    new BrandDTO(vehicles.getBrand().getBrandid(), vehicles.getBrand().getBrandname()),
                    vehicles.getVehicleOverView(),
                    vehicles.getVehiclePricePerDay(),
                    vehicles.getVehicleModelyear(),
                    vehicles.getVehicleFuelType(),
                    vehicles.getVehicleEngineCapacity(),
                    vehicles.getVehicleSeatingCapacity(),
                    vehicles.getVehicleAirConditioner(),
                    vehicles.getVehiclePowerDoorLocks(),
                    vehicles.getVehicleAntiLockBrakingSystem(),
                    vehicles.getVehicleBrakeAssist(),
                    vehicles.getVehiclePowerSteering(),
                    vehicles.getVehicleDriverAirbag(),
                    vehicles.getVehiclePassengerAirbag(),
                    vehicles.getVehiclePowerWindows(),
                    vehicles.getVehicleCDPlayer(),
                    vehicles.getVehicleCentralLocking(),
                    vehicles.getVehicleCrashSensor(),
                    vehicles.getVehicleLeatherSeats()

            );

            registerVehiclesDTOS.add(registerVehicles);
        }
        return registerVehiclesDTOS;
    }
}
