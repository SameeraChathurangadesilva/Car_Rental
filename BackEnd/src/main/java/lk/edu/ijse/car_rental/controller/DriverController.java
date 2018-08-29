package lk.edu.ijse.car_rental.controller;

import lk.edu.ijse.car_rental.dto.DriverDTO;
import lk.edu.ijse.car_rental.serivce.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    private boolean saveDriver(@RequestBody DriverDTO driverDTO){
        return driverService.saveDriver(driverDTO);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<DriverDTO> getAll(){
        return driverService.getAll();
    }

    @DeleteMapping(value = "{Driverid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteDriver(@PathVariable("Driverid") String Driverid){
        return driverService.deleteDriver(Driverid);
    }

    @GetMapping(value = "{Driverid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public DriverDTO searchDriver(@PathVariable("Driverid") String Driverid){
        return driverService.searchDriver(Driverid);
    }
}
