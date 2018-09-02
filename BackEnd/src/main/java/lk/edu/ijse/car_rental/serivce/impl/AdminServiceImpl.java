package lk.edu.ijse.car_rental.serivce.impl;

import lk.edu.ijse.car_rental.dto.AdminDTO;
import lk.edu.ijse.car_rental.entity.Admin;
import lk.edu.ijse.car_rental.repository.AdminRepository;
import lk.edu.ijse.car_rental.serivce.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public boolean canAuthenticate(String adminName, String adminPassword) {

        boolean exists = adminRepository.existsById(adminName);

        if(!exists){
            return false;
        }

        Admin admin = adminRepository.findById(adminName).get();

        return admin.getAdminPassword().equals(adminPassword);
    }


}
