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
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveAdmin(AdminDTO adminDTO) {
        Admin admin = new Admin(
                adminDTO.getAdminid(),
                adminDTO.getAdminname(),
                adminDTO.getAdminpassword(),
                adminDTO.getAdminRepassword()
        );

        adminRepository.save(admin);
        return true;
    }

    @Override
    public boolean deleteAdmin(String Adminid) {
        adminRepository.deleteById(Adminid);
        return true;
    }

    @Override
    public AdminDTO searchAdmin(String Adminid) {
        return null;
    }

    @Override
    public ArrayList<AdminDTO> getAll() {

        List<Admin> admins = adminRepository.findAll();

        ArrayList<AdminDTO> allAdmins = new ArrayList<>();

        for (Admin admin : admins) {

            AdminDTO adminDTO = new AdminDTO(
                    admin.getAdminid(),
                    admin.getAdminname(),
                    admin.getAdminpassword(),
                    admin.getAdminRepassword()
            );
            allAdmins.add(adminDTO);
        }

        return allAdmins;
    }
}
