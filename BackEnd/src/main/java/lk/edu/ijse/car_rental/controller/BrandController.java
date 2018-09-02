package lk.edu.ijse.car_rental.controller;

import lk.edu.ijse.car_rental.dto.BrandDTO;
import lk.edu.ijse.car_rental.serivce.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveBrand(@RequestBody BrandDTO brandDTO){
        return brandService.saveBrand(brandDTO);
    }

    @DeleteMapping(value = "{brandid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteBrand (@PathVariable("brandid") String brandid){
        return brandService.deleteBrand(brandid);
    }

    @GetMapping(value = "{brandid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public BrandDTO searchBrand(@PathVariable("brandid") String brandid){
       return brandService.searchBrand(brandid);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<BrandDTO> getAll(){
        return brandService.getAll();
    }
}
