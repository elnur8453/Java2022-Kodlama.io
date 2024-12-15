package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.requests.CreateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentacar.entities.concretes.Brand;


import java.util.List;


public interface BrandService {
    List<GetAllBrandsResponse> getAll(); // Brendleri getirsin
    void add(CreateBrandRequest createBrandRequest);
}
