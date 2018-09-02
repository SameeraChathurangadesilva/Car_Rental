package lk.edu.ijse.car_rental.serivce;

import lk.edu.ijse.car_rental.dto.BrandDTO;
import java.util.ArrayList;

public interface BrandService {

    public boolean saveBrand(BrandDTO brandDTO);

    public boolean deleteBrand(String brandid);

    public BrandDTO searchBrand(String brandid);

    public ArrayList<BrandDTO> getAll();
}
