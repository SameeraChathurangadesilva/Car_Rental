package lk.edu.ijse.car_rental.serivce.impl;

import lk.edu.ijse.car_rental.dto.BrandDTO;
import lk.edu.ijse.car_rental.entity.Brand;
import lk.edu.ijse.car_rental.repository.BrandRepository;
import lk.edu.ijse.car_rental.serivce.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveBrand(BrandDTO brandDTO) {
        Brand brand = new Brand(
                brandDTO.getBrandid(),
                brandDTO.getBrandname());
        brandRepository.save(brand);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteBrand(String Brandid) {
        brandRepository.deleteById(Brandid);
        return true;
    }

    @Override
    public BrandDTO searchBrand(String Brandid) {
        Brand brand = brandRepository.findById(Brandid).get();
        return new BrandDTO(brand.getBrandid(),brand.getBrandname());
    }

    @Override
    public ArrayList<BrandDTO> getAll() {
        List<Brand> brandList = brandRepository.findAll();

        ArrayList<BrandDTO> getAll = new ArrayList<>();

        for (Brand brand : brandList) {
            BrandDTO brandDTO = new BrandDTO(
                    brand.getBrandid(),
                    brand.getBrandname()
            );
            getAll.add(brandDTO);
        }
        return getAll;
    }
}
