package lk.edu.ijse.car_rental.controller;

import lk.edu.ijse.car_rental.dto.AdminDTO;
import lk.edu.ijse.car_rental.serivce.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(value = "api/v1/admin", consumes = MediaType.APPLICATION_JSON_VALUE ,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean  canAuthenticate(@RequestBody AdminDTO adminDTO){
        return adminService.canAuthenticate(adminDTO.getAdminName(),adminDTO.getAdminPassword());
    }
}
