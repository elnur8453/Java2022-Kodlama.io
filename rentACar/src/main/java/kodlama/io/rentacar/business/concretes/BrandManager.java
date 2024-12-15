package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.requests.CreateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll(); //databasadan gelen datalar
        List<GetAllBrandsResponse> brandResponse = new ArrayList<>(); //sorgunu cagirana gosterilecek datalar

        for (Brand brand : brands) { //databasadaki datalari gezecek
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse(); //gosterilecekleri bir bir yaradiriq
            responseItem.setId(brand.getId()); //gosterilene databasadakinin id-si set olur
            responseItem.setName(brand.getName()); //gosterilene databsadaki name-si set olur

            brandResponse.add(responseItem); //her dongu bitende yaranan Item-i Brand listine atir
        }
        return brandResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());

        this.brandRepository.save(brand);
    }
}
