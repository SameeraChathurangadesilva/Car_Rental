package lk.edu.ijse.car_rental.controller;

import lk.edu.ijse.car_rental.dto.AdminDTO;
import lk.edu.ijse.car_rental.serivce.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveAdmin(@RequestBody AdminDTO adminDTO){
        return adminService.saveAdmin(adminDTO);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<AdminDTO> getAll(){
        return adminService.getAll();
    }
}
