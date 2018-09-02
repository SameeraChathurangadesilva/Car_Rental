package lk.edu.ijse.car_rental.controller;

import lk.edu.ijse.car_rental.dto.RegisterVehiclesDTO;
import lk.edu.ijse.car_rental.serivce.RegisterVehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/vehicle")
public class RegisterVehiclesController {

    @Autowired
    private RegisterVehiclesService registerVehiclesService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveRegisterVehicles(@RequestBody RegisterVehiclesDTO registerVehiclesDTO) {
        System.out.println("save : " + registerVehiclesDTO);
        return registerVehiclesService.saveRegisterVehicles(registerVehiclesDTO);
    }

    @DeleteMapping(value = "{vehicleId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteRegisterVehicle(@PathVariable("vehicleId") String vehicleId) {
        return registerVehiclesService.deleteRegisterVehicles(vehicleId);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public RegisterVehiclesDTO searchVehicles(String vehicleId) {
        return registerVehiclesService.searchRegisterVehicles(vehicleId);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<RegisterVehiclesDTO> getAll() {
        return registerVehiclesService.getAllRegisterVehicles();
    }
}
