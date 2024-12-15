package kodlama.io.rentacar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "brands")
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
