package kodlama.io.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllBrandsResponse { //neleri gostermek isteyirik brandlari cagirana
    private int id;
    private String name;
}
